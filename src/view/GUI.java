package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class GUI {
    private JFrame frame;

    public static void display() {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                GUI window = new GUI();
                window.frame.setVisible(true);
            }

        });
    }

    public GUI() {
        init();
    }

    private void init() {
    }
}

