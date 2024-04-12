package controller;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import constant.Constant;
import model.Customer;
import service.CustomerService;

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
}
