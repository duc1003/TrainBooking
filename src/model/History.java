package model;

import java.io.Serializable;

public class History implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String transportID;
    private int cardID;
    private int trainID;
    private int seat;
    public String getTransportID() {
        return transportID;
    }
    public void setTransportID(String transportID) {
        this.transportID = transportID;
    }
    public int getCardID() {
        return cardID;
    }
    public void setCardID(int cardID) {
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
