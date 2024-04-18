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

public class UserRegister extends JFrame {

    private JTextField fieldEmail;
    private JPasswordField fieldPassword;
    public static UserLogin frame;
    private JPasswordField fieldName;
    private JPasswordField fieldPhone;
    private JTextField fieldCCCD;
    
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
    
    public UserRegister() {
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

        JLabel titleLogin = new JLabel("Đăng ký");
        titleLogin.setForeground(new Color(0, 100, 0)); // Dark green text color
        titleLogin.setFont(new Font("Tahoma", Font.BOLD, 28)); // Larger font size
        titleLogin.setBounds(771, 11, 136, 40); // Centered horizontally
        panel.add(titleLogin);

        fieldEmail = new JTextField();
        fieldEmail.setBounds(732, 62, 250, 35);
        panel.add(fieldEmail);
        fieldEmail.setColumns(10);

        JLabel lblEmail = new JLabel("Tên đăng nhập:");
        lblEmail.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblEmail.setBounds(580, 57, 150, 35); // Adjusted position
        panel.add(lblEmail);

        JLabel lblPassword = new JLabel("Mật khẩu:");
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblPassword.setBounds(580, 115, 150, 35); // Adjusted position
        panel.add(lblPassword);

        fieldPassword = new JPasswordField();
        fieldPassword.setBounds(732, 117, 250, 35);
        panel.add(fieldPassword);

        JButton btnUserRegister = new JButton("Đăng ký");
        btnUserRegister.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnUserRegister.setBounds(757, 378, 150, 40); // Adjusted size
        panel.add(btnUserRegister);
        btnUserRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer customer = new Customer();
				customer.setCardID(fieldCCCD.getText());
				customer.setEmail(fieldEmail.getText());
				customer.setName(fieldName.getText());
				customer.setPhone(fieldPhone.getText());
				customer.setPassword(new String(fieldPassword.getPassword()));
				boolean success = client.userRegister(customer);
				if (success) {
					UserUtils.setCurrentCustomer(customer);
					UserHome.display();
					frame.setVisible(false);
				} else {

				}
			}
		});

        // Navigation buttons
        JButton btnLogin = new JButton("Đăng nhập\r\n");
        btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnLogin.setBounds(665, 461, 120, 35);
        panel.add(btnLogin);
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                UserLogin userLogin = new UserLogin();
                userLogin.setVisible(true);
            }
        });

        JButton btnAdminLogin = new JButton("Admin");
        btnAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnAdminLogin.setBounds(850, 461, 120, 35);
        panel.add(btnAdminLogin);
        btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AdminLogin.display();
			}
		});
        
        fieldName = new JPasswordField();
        fieldName.setBounds(732, 180, 250, 35);
        panel.add(fieldName);
        
        fieldPhone = new JPasswordField();
        fieldPhone.setBounds(732, 238, 250, 35);
        panel.add(fieldPhone);
        
        JLabel lblName = new JLabel("Họ và tên:");
        lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblName.setBounds(580, 180, 150, 35);
        panel.add(lblName);
        
        JLabel lblPhone = new JLabel("Số điện thoại");
        lblPhone.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblPhone.setBounds(580, 238, 150, 35);
        panel.add(lblPhone);
        
        fieldCCCD = new JTextField();
        fieldCCCD.setColumns(10);
        fieldCCCD.setBounds(732, 302, 250, 35);
        panel.add(fieldCCCD);
        
        JLabel lblCCCD = new JLabel("Tên đăng nhập:");
        lblCCCD.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblCCCD.setBounds(580, 302, 150, 35);
        panel.add(lblCCCD);
        btnAdminLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                AdminLogin adminLogin = new AdminLogin();
                adminLogin.setVisible(true);
            }
        });
    }
}
