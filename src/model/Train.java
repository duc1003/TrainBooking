package model;

import java.io.Serializable;

public class Train implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private int trainID;
    private String trainName;
    private String fromStation;
    private String toStation;
    private int seats;
    private double price;
    private String date;
    public int getTrainID() {
        return trainID;
    }
    public void setTrainID(int trainID) {
        this.trainID = trainID;
    }
    public String getTrainName() {
        return trainName;
    }
    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }
    public String getFromStation() {
        return fromStation;
    }
    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }
    public String getToStation() {
        return toStation;
    }
    public void setToStation(String toStation) {
        this.toStation = toStation;
    }
    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

}
