package serviceImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import model.Customer;
import service.CustomerService;

public class CustomerServiceImpl extends UnicastRemoteObject implements CustomerService {

    public CustomerServiceImpl() throws RemoteException {
        //TODO Auto-generated constructor stub
    }
    public static CustomerServiceImpl getInstance() throws RemoteException {
		return new CustomerServiceImpl();
	}

    @Override
    public Customer getCustomerByEmailId(String email) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCustomerByEmailId'");
    }

    @Override
    public List<Customer> getAllCustomers() throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCustomers'");
    }

    @Override
    public String updateCustomer(Customer customer) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCustomer'");
    }

    @Override
    public String deleteCustomer(Customer customer) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCustomer'");
    }

    @Override
    public String registerCustomer(Customer customer) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerCustomer'");
    }

    @Override
    public Customer loginCustomer(String email, String password) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loginCustomer'");
    }
    
}
