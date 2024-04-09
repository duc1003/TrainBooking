package view;

import java.rmi.RemoteException;

public class Application extends Thread {

    public void run() {
        try {
            controller.Server.startServer();
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        Application application = new Application();
        application.start();
        Thread.sleep(1000);
        GUI.display();
    }
    
}
