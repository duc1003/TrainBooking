package serviceImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import model.Train;
import service.TrainService;

public class TrainServiceImpl extends UnicastRemoteObject implements TrainService {

    public TrainServiceImpl() throws RemoteException {
        //TODO Auto-generated constructor stub
    }
    public static TrainServiceImpl getInstance() throws RemoteException {
		return new TrainServiceImpl();
	}

    @Override
    public String addTrain(Train train) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addTrain'");
    }

    @Override
    public String deleteTrainById(String trainNo) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteTrainById'");
    }

    @Override
    public String updateTrain(Train train) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateTrain'");
    }

    @Override
    public Train getTrainById(String trainNo) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTrainById'");
    }

    @Override
    public List<Train> getAllTrains() throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllTrains'");
    }

    @Override
    public List<Train> getTrainsBetweenStations(String fromStation, String toStation) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTrainsBetweenStations'");
    }
    
}
