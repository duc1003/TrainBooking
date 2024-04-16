package serviceImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import constant.Constant;
import constant.Schema;
import model.Admin;
import service.AdminService;
import utils.DBUtils;

public class AdminServiceImpl extends UnicastRemoteObject implements AdminService {

    public AdminServiceImpl() throws RemoteException {
        //TODO Auto-generated constructor stub
    }
    public static AdminServiceImpl getInstance() throws RemoteException {
        return new AdminServiceImpl();
    }
		

    @Override
    public Admin login(String username, String password) throws RemoteException{
        Admin admin = null;
        Statement stm = DBUtils.getStatement();
        String query = "SELECT * FROM "+ Constant.ADMIN_TABLE +" " +
                     "WHERE "+ Schema.Admin.USERNAME +" = '" + username + "' AND "+ Schema.Admin.PASSWORD +" = '" + password + "'";
        ResultSet rs;
        try {
            rs = stm.executeQuery(query);
            while (rs.next()) {
                admin = new Admin();
                admin.setId(rs.getInt(Schema.Admin.ID));
                admin.setUsername(rs.getString(Schema.Admin.USERNAME));
                admin.setPassword(rs.getString(Schema.Admin.PASSWORD));
                admin.setAccessKey(rs.getString(Schema.Admin.ACCESS_KEY));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return admin;
    }
    
}
