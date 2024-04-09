package service;


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import model.Train;


public interface TrainService extends Remote {

	public String addTrain(Train train) throws RemoteException;

	public String deleteTrainById(String trainNo) throws RemoteException;

	public String updateTrain(Train train) throws RemoteException;

	public Train getTrainById(String trainNo) throws RemoteException;

	public List<Train> getAllTrains() throws RemoteException;

	public List<Train> getTrainsBetweenStations(String fromStation, String toStation) throws RemoteException;
}
