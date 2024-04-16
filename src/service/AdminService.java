package service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import model.Admin;

public interface AdminService extends Remote{
    public Admin login(String username, String password) throws RemoteException;
}
