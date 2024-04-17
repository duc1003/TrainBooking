package serviceImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

import constant.Constant;
import constant.Schema;
import model.Train;
import service.TrainService;
import utils.AppUtils;
import utils.DBUtils;


public class TrainServiceImpl extends UnicastRemoteObject implements TrainService {

    public TrainServiceImpl() throws RemoteException {
        //TODO Auto-generated constructor stub
    }
    public static TrainServiceImpl getInstance() throws RemoteException {
		return new TrainServiceImpl();
	}

    @Override
    public Boolean addTrain(Train train) throws RemoteException {
        Statement stm = DBUtils.getStatement();
        String query = "INSERT INTO "+ Constant.TRAIN_TABLE +" VALUES (" +
                 train.getTrainID() + ", '" +
                 train.getTrainName() + "', '" +
                 train.getFromStation() + "', '" +
                 train.getToStation() + "', " +
                 train.getSeats() + ", " +
                 train.getPrice() + ", '" +
                 AppUtils.convertDateFormat(train.getDate()) + "')";
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
    public Boolean deleteTrainById(String trainID) throws RemoteException {
        Statement stm = DBUtils.getStatement();
        String query = "DELETE FROM " + Constant.TRAIN_TABLE + " WHERE trainID = '" + trainID + "'";
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
    public Boolean updateTrain(Train train) throws RemoteException {
        Statement stm = DBUtils.getStatement();
        String query = "UPDATE " + Constant.TRAIN_TABLE + " SET " +
               "trainName = '" + train.getTrainName() + "', " +
               "fromStation = '" + train.getFromStation() + "', " +
               "toStation = '" + train.getToStation() + "', " +
               "seats = " + train.getSeats() + ", " +
               "price = " + train.getPrice() + ", " +
               "date = '" + train.getDate() + "' " +
               "WHERE trainID = '" + train.getTrainID() + "'";
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
    public Train getTrainById(String trainID) throws RemoteException {
        Train train = null;
        String query = "SELECT * FROM " + Constant.TRAIN_TABLE + " WHERE trainID = '" + trainID + "'";
        Statement stm = DBUtils.getStatement();
        ResultSet rs;
        try {
            rs = stm.executeQuery(query);
            while (rs.next()) {
                train = new Train();
                train.setTrainID(rs.getInt(Schema.Train.TRAIN_ID));
                train.setTrainName(rs.getString(Schema.Train.TRAIN_NAME));
                train.setFromStation(rs.getString(Schema.Train.FROM_STATION));
                train.setToStation(rs.getString(Schema.Train.TO_STATION));
                train.setSeats(rs.getInt(Schema.Train.SEATS));
                train.setPrice(rs.getDouble(Schema.Train.PRICE));
                train.setDate(rs.getString(Schema.Train.DATE));
            }
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return train;
    }

    @Override
    public List<Train> getAllTrains() throws RemoteException {
        List<Train> trains = new ArrayList<Train>();
        String query = "SELECT * FROM " + Constant.TRAIN_TABLE;
        Statement stm = DBUtils.getStatement();
        ResultSet rs;
        try {
            rs = stm.executeQuery(query);
            while (rs.next()) {
                Train train = new Train();
                train.setTrainID(rs.getInt(Schema.Train.TRAIN_ID));
                train.setTrainName(rs.getString(Schema.Train.TRAIN_NAME));
                train.setFromStation(rs.getString(Schema.Train.FROM_STATION));
                train.setToStation(rs.getString(Schema.Train.TO_STATION));
                train.setSeats(rs.getInt(Schema.Train.SEATS));
                train.setPrice(rs.getDouble(Schema.Train.PRICE));
                train.setDate(rs.getString(Schema.Train.DATE));
                trains.add(train);
            }
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return trains;
    }

    @Override
    public List<Train> getTrainsBetweenStations(String fromStation, String toStation) throws RemoteException {
        List<Train> trains = new ArrayList<Train>();
        String query = "SELECT * FROM " + Constant.TRAIN_TABLE + " WHERE fromStation like '%"+ fromStation +"%' AND toStation like '%"+ toStation + "%'";
        System.out.println(query);
        Statement stm = DBUtils.getStatement();
        ResultSet rs;
        try {
            rs = stm.executeQuery(query);
            while (rs.next()) {
                Train train = new Train();
                train.setTrainID(rs.getInt(Schema.Train.TRAIN_ID));
                train.setTrainName(rs.getString(Schema.Train.TRAIN_NAME));
                train.setFromStation(rs.getString(Schema.Train.FROM_STATION));
                train.setToStation(rs.getString(Schema.Train.TO_STATION));
                train.setSeats(rs.getInt(Schema.Train.SEATS));
                train.setPrice(rs.getDouble(Schema.Train.PRICE));
                train.setDate(rs.getString(Schema.Train.DATE));
                trains.add(train);
            }
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return trains;
    }
    
}
