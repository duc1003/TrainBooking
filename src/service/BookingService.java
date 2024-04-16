package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import model.History;


public interface BookingService extends Remote{

	public List<History> getAllBookingsByCustomerId(int cardID) throws RemoteException;

	public boolean createHistory(History bookingDetails) throws RemoteException;

}
