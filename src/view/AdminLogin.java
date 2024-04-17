package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import constant.Constant;
import controller.client;
import model.Admin;
import model.Customer;
import utils.AdminUtils;
import utils.UserUtils;

public class AdminLogin extends JFrame {

    private JTextField fieldEmail;
    private JPasswordField passwordField;
    public static AdminLogin frame;
    
    public static void display() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new AdminLogin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
   
    public AdminLogin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1016, 573);
        setTitle("User Login");
        setLocationRelativeTo(null); // Center the window

        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setBackground(new Color(173, 216, 230)); // Light blue background
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        JLabel lblBackground = new JLabel();
        lblBackground.setBounds(10, 128, 584, 444);
        lblBackground.setIcon(new ImageIcon(Constant.PATH_BG1));
        panel.add(lblBackground);

        JLabel titleLogin = new JLabel("Đăng nhập với Admin\r\n");
        titleLogin.setForeground(new Color(0, 100, 0)); // Dark green text color
        titleLogin.setFont(new Font("Tahoma", Font.BOLD, 28)); // Larger font size
        titleLogin.setBounds(666, 47, 300, 40); // Centered horizontally
        panel.add(titleLogin);

        fieldEmail = new JTextField();
        fieldEmail.setBounds(732, 150, 250, 35);
        panel.add(fieldEmail);
        fieldEmail.setColumns(10);

        JLabel lblEmail = new JLabel("Tên đăng nhập:");
        lblEmail.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblEmail.setBounds(580, 150, 150, 35); // Adjusted position
        panel.add(lblEmail);

        JLabel lblPassword = new JLabel("Mật khẩu:");
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblPassword.setBounds(580, 230, 150, 35); // Adjusted position
        panel.add(lblPassword);

        passwordField = new JPasswordField();
        passwordField.setBounds(732, 230, 250, 35);
        panel.add(passwordField);

        JButton btnLogin = new JButton("Đăng nhập");
        btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnLogin.setBounds(732, 300, 150, 40); // Adjusted size
        panel.add(btnLogin);
        btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Admin admin = null;
				admin = client.adminLogin(fieldEmail.getText(), new String(passwordField.getPassword()));
				if (admin != null) {
					AdminUtils.setCurrentAdmin(admin);
					AdminHome.display();
					frame.setVisible(false);
				}
			}
			
		});

        // Navigation buttons
        JButton btnUserRegister = new JButton("Đăng ký");
        btnUserRegister.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnUserRegister.setBounds(640, 400, 120, 35);
        panel.add(btnUserRegister);
        btnUserRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                UserRegister userRegister = new UserRegister();
                userRegister.setVisible(true);
            }
        });

        JButton btnAdminLogin = new JButton("Đăng nhập với User");
        btnAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnAdminLogin.setBounds(793, 400, 189, 35);
        panel.add(btnAdminLogin);
        btnAdminLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                UserLogin userLogin = new UserLogin();
                userLogin.setVisible(true);
            }
        });
    }
}
