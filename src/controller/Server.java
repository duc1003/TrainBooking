package controller;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import constant.Constant;
import serviceImpl.AdminServiceImpl;
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
			AdminServiceImpl adminServiceImpl = AdminServiceImpl.getInstance();

			// Create registry for rmi server at 2582 port
			Registry registry = LocateRegistry.createRegistry(3333);

			// Bind the object `wordDAO` with the object named `word` in rmi server
			registry.rebind(Constant.CUSTOMER_TABLE, customerServiceImpl);
			registry.rebind(Constant.HISTORY_TABLE, bookingServiceImpl);
			registry.rebind(Constant.TRAIN_TABLE, trainServiceImpl);
			registry.rebind(Constant.ADMIN_TABLE, adminServiceImpl);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
