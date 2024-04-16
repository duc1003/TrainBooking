package controller;

import java.util.ArrayList;
import java.util.List;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import constant.Constant;
import model.History;
import model.Admin;
import model.Customer;
import model.Train;
import service.AdminService;
import service.BookingService;
import service.CustomerService;
import service.TrainService;

public class client {
    public static Customer userLogin(String username, String password) {
		Customer customer = null;
		try {
			Registry registry = LocateRegistry.getRegistry("localhost", 3333);
			CustomerService customerService = (CustomerService) registry.lookup(Constant.CUSTOMER_TABLE);
			customer = customerService.loginCustomer(username, password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return customer;
	}

	public static boolean userRegister(Customer customer){
		boolean status = false;
		try {
			Registry registry = LocateRegistry.getRegistry("localhost", 3333);
			CustomerService customerService = (CustomerService) registry.lookup(Constant.CUSTOMER_TABLE);
			status = customerService.registerCustomer(customer);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;
	}

	public static boolean userUpdate(Customer customer){
		boolean status = false;
		try {
			Registry registry = LocateRegistry.getRegistry("localhost", 3333);
			CustomerService customerService = (CustomerService) registry.lookup(Constant.CUSTOMER_TABLE);
			status = customerService.updateCustomer(customer);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;
	}

	public static boolean changePassword(Customer customer){
		boolean status = false;
		try {
			Registry registry = LocateRegistry.getRegistry("localhost", 3333);
			CustomerService customerService = (CustomerService) registry.lookup(Constant.CUSTOMER_TABLE);
			status = customerService.changePassword(customer);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;
	}

	public static List<Train> getAllTrains() {
		List<Train> trains = new ArrayList<Train>();
		try {
			Registry registry = LocateRegistry.getRegistry("localhost", 3333);
			TrainService trainService = (TrainService) registry.lookup(Constant.TRAIN_TABLE);
			trains = trainService.getAllTrains();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return trains;
	}
	
	public static Admin adminLogin(String username, String password) {
		Admin admin = null;
		try {
			Registry registry = LocateRegistry.getRegistry("localhost", 3333);
			AdminService adminService = (AdminService) registry.lookup(Constant.ADMIN_TABLE);
			admin = adminService.login(username, password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return admin;
	}
	public static boolean addTrain(Train train){
		boolean status = false;
		try {
			Registry registry = LocateRegistry.getRegistry("localhost", 3333);
			TrainService trainService = (TrainService) registry.lookup(Constant.TRAIN_TABLE);
			status = trainService.addTrain(train);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;
	}

	public static List<Train> findTrains(String fromStation, String toStation, String date){
		List<Train> trains = new ArrayList<Train>();
		try {
			Registry registry = LocateRegistry.getRegistry("localhost", 3333);
			TrainService trainService = (TrainService) registry.lookup(Constant.TRAIN_TABLE);
			trains = trainService.getTrainsBetweenStations(fromStation, toStation);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return trains;
	}

	public static boolean createHistory(History history){
		try {
			Registry registry = LocateRegistry.getRegistry("localhost", 3333);
			BookingService bookingService = (BookingService) registry.lookup(Constant.HISTORY_TABLE);
			if (bookingService.createHistory(history)) {
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
}
