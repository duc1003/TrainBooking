package controller;

import java.util.ArrayList;
import java.util.List;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import constant.Constant;
import model.Customer;
import model.Train;
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
}
