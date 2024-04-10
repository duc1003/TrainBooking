package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import model.Customer;

public interface CustomerService  extends Remote {
    public Customer getCustomerByEmailId(String email) throws RemoteException;

	public List<Customer> getAllCustomers() throws RemoteException;

	public Boolean updateCustomer(Customer customer) throws RemoteException;

	public Boolean deleteCustomer(int cardID) throws RemoteException;

	public Boolean registerCustomer(Customer customer) throws RemoteException;
	
	public Customer loginCustomer(String email, String password) throws RemoteException;
}
