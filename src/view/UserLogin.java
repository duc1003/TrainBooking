package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import constant.Constant;
import controller.client;
import model.Customer;
import utils.UserUtils;

public class UserLogin extends JFrame {

    private JTextField fieldEmail;
    private JPasswordField passwordField;
    public static UserLogin frame;

    public UserLogin() {
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

        JLabel titleLogin = new JLabel("Đăng nhập");
        titleLogin.setForeground(new Color(0, 100, 0)); // Dark green text color
        titleLogin.setFont(new Font("Tahoma", Font.BOLD, 28)); // Larger font size
        titleLogin.setBounds(732, 50, 200, 40); // Centered horizontally
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
                login();
            }
        });

        passwordField.addActionListener(v -> login());

        // Navigation buttons
        JButton btnUserRegister = new JButton("Đăng ký");
        btnUserRegister.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnUserRegister.setBounds(680, 400, 120, 35);
        panel.add(btnUserRegister);
        btnUserRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                UserRegister.display();
            }
        });

        JButton btnAdminLogin = new JButton("Admin");
        btnAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnAdminLogin.setBounds(832, 400, 120, 35);
        panel.add(btnAdminLogin);
        btnAdminLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                AdminLogin.display();
            }
        });
    }

    private void login() {
        Customer customer = client.userLogin(fieldEmail.getText(), new String(passwordField.getPassword()));
        if (customer != null) {
            UserUtils.setCurrentCustomer(customer);
            UserHome.display();
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc mật khẩu không đúng", "Lỗi đăng nhập",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void display() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new UserLogin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
