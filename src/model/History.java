package model;

import java.io.Serializable;

public class History implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String transportID;
    private String cardID;
    private int trainID;
    private int seat;
    private String fromStation;
    private String toStation;
    private String date;
    private double price;
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
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getTransportID() {
        return transportID;
    }
    public void setTransportID(String transportID) {
        this.transportID = transportID;
    }
    public String getCardID() {
        return cardID;
    }
    public void setCardID(String cardID) {
        this.cardID = cardID;
    }
    public int getTrainID() {
        return trainID;
    }
    public void setTrainID(int trainID) {
        this.trainID = trainID;
    }
    public int getSeat() {
        return seat;
    }
    public void setSeat(int seat) {
        this.seat = seat;
    }

}
