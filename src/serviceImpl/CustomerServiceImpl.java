package serviceImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import constant.Constant;
import constant.Schema;
import model.Customer;
import service.CustomerService;
import utils.DBUtils;

public class CustomerServiceImpl extends UnicastRemoteObject implements CustomerService {

    public CustomerServiceImpl() throws RemoteException {
        //TODO Auto-generated constructor stub
    }
    public static CustomerServiceImpl getInstance() throws RemoteException {
		return new CustomerServiceImpl();
	}

    @Override
    public Customer getCustomerByEmailId(String email) throws RemoteException {
        Customer customer = null;
        Statement stm = DBUtils.getStatement();
        String query = "select * from " + Constant.CUSTOMER_TABLE + " where "+ Schema.Customer.EMAIL +"= "+ email;
        ResultSet rs;
        try {
            rs = stm.executeQuery(query);
            while (rs.next()) {
                customer = new Customer();
                customer.setCardID(rs.getInt(Schema.Customer.CARD_ID));
                customer.setEmail(rs.getString(Schema.Customer.EMAIL));
                customer.setPassword(rs.getString(Schema.Customer.PASSWORD));
                customer.setPhone(rs.getInt(Schema.Customer.PHONE));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return customer;

    }

    @Override
    public List<Customer> getAllCustomers() throws RemoteException {
        List<Customer> customers = new ArrayList<Customer>();
        Statement stm = DBUtils.getStatement();
        String query = "select * from " + Constant.CUSTOMER_TABLE;
        ResultSet rs;
        try {
            rs = stm.executeQuery(query);
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setCardID(rs.getInt(Schema.Customer.CARD_ID));
                customer.setEmail(rs.getString(Schema.Customer.EMAIL));
                customer.setPassword(rs.getString(Schema.Customer.PASSWORD));
                customer.setPhone(rs.getInt(Schema.Customer.PHONE));
                customers.add(customer);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return customers;

    }

    @Override
    public Boolean updateCustomer(Customer customer) throws RemoteException {
        Statement stm = DBUtils.getStatement();
        String query = "UPDATE "+ Constant.CUSTOMER_TABLE +" SET " +
                     "email = '" + customer.getEmail() + "', " +
                     "password = '" + customer.getPassword() + "', " +
                     "phone = " + customer.getPhone() + " " +
                     "WHERE cardID = " + customer.getCardID();
        try {
            if (stm.executeUpdate(query) != 0) {
                return true;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean deleteCustomer(int cardID) throws RemoteException {
        Statement stm = DBUtils.getStatement();
        String query = "DELETE FROM "+ Constant.CUSTOMER_TABLE +
                    "WHERE cardID = " + cardID;
        try {
            if (stm.executeUpdate(query) != 0) {
                return true;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean registerCustomer(Customer customer) throws RemoteException {
        Statement stm = DBUtils.getStatement();
        String query = "INSERT INTO "+ Constant.CUSTOMER_TABLE +" VALUES (" +
                     customer.getCardID() + ", '" +
                     customer.getEmail() + "', '" +
                     customer.getPassword() + "', " +
                     customer.getPhone() + "', " +
                     customer.getName() +
                     ")";
        try {
            if (stm.executeUpdate(query) != 0) {
                return true;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Customer loginCustomer(String email, String password) throws RemoteException {
        Customer customer = null;
        Statement stm = DBUtils.getStatement();
        String query = "SELECT * FROM "+ Constant.CUSTOMER_TABLE +" " +
                     "WHERE "+ Schema.Customer.EMAIL +" = '" + email + "' AND "+ Schema.Customer.PASSWORD +" = '" + password + "'";
        ResultSet rs;
        try {
            rs = stm.executeQuery(query);
            while (rs.next()) {
                customer = new Customer();
                customer.setCardID(rs.getInt(Schema.Customer.CARD_ID));
                customer.setEmail(rs.getString(Schema.Customer.EMAIL));
                customer.setPassword(rs.getString(Schema.Customer.PASSWORD));
                customer.setPhone(rs.getInt(Schema.Customer.PHONE));
                customer.setName(rs.getString(Schema.Customer.NAME));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return customer;
    }
    // public static void main(String[] args) {
    //     Customer customer = null;
    //     try {
    //         customer = CustomerServiceImpl.getInstance().loginCustomer("duy@demo.com", "duy");
    //     } catch (RemoteException e) {
    //         // TODO Auto-generated catch block
    //         e.printStackTrace();
    //     }
    //     if (customer != null) {
    //         System.out.println("login successful");
    //     } else System.out.println("login failed");
    // }
    
}
