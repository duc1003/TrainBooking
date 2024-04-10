package service;


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import model.Train;


public interface TrainService extends Remote {

	public Boolean addTrain(Train train) throws RemoteException;

	public Boolean deleteTrainById(String trainID) throws RemoteException;

	public Boolean updateTrain(Train train) throws RemoteException;

	public Train getTrainById(String trainID) throws RemoteException;

	public List<Train> getAllTrains() throws RemoteException;

	public List<Train> getTrainsBetweenStations(String fromStation, String toStation) throws RemoteException;
}
