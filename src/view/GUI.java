package view;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class GUI {
    private JFrame frame;

    public static void display() {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                GUI window = new GUI();
                // window.frame.setVisible(true);
            }

        });
    }

    public GUI() {
        init();
    }

    private void init() {
        UserLogin.display();
    }
}

