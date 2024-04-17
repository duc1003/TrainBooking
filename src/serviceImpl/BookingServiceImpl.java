package serviceImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import constant.Constant;

import java.util.ArrayList;

import model.History;
import service.BookingService;
import utils.DBUtils;

public class BookingServiceImpl extends UnicastRemoteObject implements BookingService {

    public BookingServiceImpl() throws RemoteException {
        //TODO Auto-generated constructor stub
    }
    public static BookingServiceImpl getInstance() throws RemoteException {
		return new BookingServiceImpl();
	}

    @Override
    public List<History> getAllBookingsByCustomerId(int cardID) throws RemoteException {
        List<History> bookings = new ArrayList<History>();
        String query = "SELECT * FROM bookings WHERE cardID = " + cardID;

        return bookings;
    }

    @Override
    public boolean createHistory(History history) throws RemoteException {
        Statement stm = DBUtils.getStatement();
        String query = "INSERT INTO history (transportID, cardID, trainID, seat) VALUES ('" + history.getTransportID() + "', '" + history.getCardID() + "', " + history.getTrainID() + ", " + history.getSeat() + ")";
        
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
    
}
