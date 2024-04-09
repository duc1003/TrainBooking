package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import model.Customer;

public interface CustomerService  extends Remote {
    public Customer getCustomerByEmailId(String email) throws RemoteException;

	public List<Customer> getAllCustomers() throws RemoteException;

	public String updateCustomer(Customer customer) throws RemoteException;

	public String deleteCustomer(Customer customer) throws RemoteException;

	public String registerCustomer(Customer customer) throws RemoteException;
	
	public Customer loginCustomer(String email, String password) throws RemoteException;
}
