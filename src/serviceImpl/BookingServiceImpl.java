package serviceImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import model.History;
import service.BookingService;

public class BookingServiceImpl extends UnicastRemoteObject implements BookingService {

    public BookingServiceImpl() throws RemoteException {
        //TODO Auto-generated constructor stub
    }
    public static BookingServiceImpl getInstance() throws RemoteException {
		return new BookingServiceImpl();
	}

    @Override
    public List<History> getAllBookingsByCustomerId(String customerEmailId) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllBookingsByCustomerId'");
    }

    @Override
    public History createHistory(History bookingDetails) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createHistory'");
    }
    
}
