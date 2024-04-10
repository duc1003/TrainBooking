package controller;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import serviceImpl.BookingServiceImpl;
import serviceImpl.CustomerServiceImpl;
import serviceImpl.TrainServiceImpl;


public class Server {
    public static void startServer() throws RemoteException {
        try {
			// Create instace of the implementation code
			CustomerServiceImpl customerServiceImpl = CustomerServiceImpl.getInstance();
			BookingServiceImpl bookingServiceImpl = BookingServiceImpl.getInstance();
			TrainServiceImpl trainServiceImpl = TrainServiceImpl.getInstance();

			// Create registry for rmi server at 2582 port
			Registry registry = LocateRegistry.createRegistry(3333);

			// Bind the object `wordDAO` with the object named `word` in rmi server
			registry.rebind("customer", customerServiceImpl);
			registry.rebind("booking", bookingServiceImpl);
			registry.rebind("train", trainServiceImpl);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
