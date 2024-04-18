package serviceImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import constant.Constant;
import constant.Schema;

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
    public List<History> getAllBookingsByCustomerId(String cardID) throws RemoteException {
        List<History> bookings = new ArrayList<History>();
        String query = "SELECT h.cardID, h.transportID, h.trainID, t.fromStation, t.toStation, t.date, h.seat, t.price "
             + "FROM History h "
             + "INNER JOIN Train t ON h.trainID = t.trainID "
             + "WHERE h.cardID = '" + cardID + "'";
        Statement stm = DBUtils.getStatement();
        try {
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()) {
                System.out.println(rs.getString(1));
                History history = new History();
                history.setCardID(rs.getString("cardID"));
                history.setTrainID(rs.getInt("trainID"));
                history.setTransportID(rs.getString("transportID"));
                history.setSeat(rs.getInt("seat"));
                history.setPrice(rs.getDouble("price"));
                history.setDate(rs.getString("date"));
                history.setFromStation(rs.getString("fromStation"));
                history.setToStation(rs.getString("toStation"));
                bookings.add(history);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

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

    @Override
    public List<String> getAllHistoryCodes() throws RemoteException {
        Statement stm = DBUtils.getStatement();
        String query = "select " + Schema.History.TRANSPORT_ID + " from " + Constant.HISTORY_TABLE;
        List<String> codes = new ArrayList<String>();
        try {
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                codes.add(rs.getString(Schema.History.TRANSPORT_ID));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return codes;
    }
    
}
