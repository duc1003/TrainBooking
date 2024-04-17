package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import controller.client;
import model.Customer;
import utils.UserUtils;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JButton;

public class UserRegister extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fieldEmail;
	private JPasswordField fieldPassword;
	private JTextField fieldName;
	private JTextField fieldPhone;
	private JTextField fieldCardID;
	static UserRegister frame;

	/**
	 * Launch the application.
	 */
	
	public static void display() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new UserRegister();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserRegister() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1099, 628);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(34, 139, 34));
		contentPane.setBackground(new Color(102, 205, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 250, 210));
		panel.setBounds(0, 0, 1096, 116);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton menuUserLogin = new JButton("Đăng nhập với User");
		menuUserLogin.setForeground(new Color(128, 0, 128));
		menuUserLogin.setFont(new Font("Tahoma", Font.BOLD, 22));
		menuUserLogin.setBounds(58, 43, 257, 41);
		panel.add(menuUserLogin);
		menuUserLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserLogin.frame.setVisible(true);
			}
		});
		
		JButton menuRegister = new JButton("Đăng ký tài khoản User");
		menuRegister.setForeground(new Color(128, 0, 128));
		menuRegister.setFont(new Font("Tahoma", Font.BOLD, 20));
		menuRegister.setBounds(378, 43, 277, 41);
		panel.add(menuRegister);
		
	
		
		JButton menuAdminLogin = new JButton("Đăng nhập với Admin");
		menuAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AdminLogin.display();
			}
		});
		menuAdminLogin.setForeground(new Color(128, 0, 128));
		menuAdminLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		menuAdminLogin.setBounds(723, 43, 257, 41);
		panel.add(menuAdminLogin);
		
		// JLabel lbl_close = new JLabel("X");
		// lbl_close.addMouseListener(new MouseAdapter() {
		// 	@Override
		// 	public void mouseClicked(MouseEvent e) {
		// 		System.exit(0);
		// 	}
		// });
		// lbl_close.setFont(new Font("Tahoma", Font.PLAIN, 30));
		// lbl_close.setForeground(new Color(241, 57, 83));
		// lbl_close.setBounds(1068, 0, 17, 22);
		// panel.add(lbl_close);
		
		fieldEmail = new JTextField();
		fieldEmail.setBounds(330, 173, 449, 45);
		contentPane.add(fieldEmail);
		fieldEmail.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(330, 217, 449, 12);
		contentPane.add(separator);
		
		JLabel lblEmail = new JLabel("Username:\r\n");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmail.setBounds(202, 183, 86, 35);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(202, 249, 86, 35);
		contentPane.add(lblPassword);
		
		fieldPassword = new JPasswordField();
		fieldPassword.setColumns(10);
		fieldPassword.setBounds(330, 239, 449, 45);
		contentPane.add(fieldPassword);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(330, 282, 449, 2);
		contentPane.add(separator_1);
		
		JLabel titleRegister = new JLabel("Đăng ký");
		titleRegister.setForeground(new Color(34, 139, 34));
		titleRegister.setBackground(new Color(127, 255, 0));
		titleRegister.setFont(new Font("Tahoma", Font.BOLD, 24));
		titleRegister.setBounds(465, 127, 118, 35);
		contentPane.add(titleRegister);
		
		JButton btnRegister = new JButton("Đăng ký tài khoản");
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer customer = new Customer();
				customer.setCardID(fieldCardID.getText());
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
		btnRegister.setBounds(418, 541, 239, 45);
		contentPane.add(btnRegister);
		
		fieldName = new JTextField();
		fieldName.setColumns(10);
		fieldName.setBounds(330, 309, 449, 45);
		contentPane.add(fieldName);
		
		JLabel lblName = new JLabel("Họ và tên:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName.setBounds(202, 319, 86, 35);
		contentPane.add(lblName);
		
		fieldPhone = new JTextField();
		fieldPhone.setColumns(10);
		fieldPhone.setBounds(330, 382, 449, 45);
		contentPane.add(fieldPhone);
		
		JLabel lblPhone = new JLabel("Số điện thoại:");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPhone.setBounds(202, 392, 118, 35);
		contentPane.add(lblPhone);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(330, 354, 449, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(330, 425, 449, 2);
		contentPane.add(separator_3);
		
		fieldCardID = new JTextField();
		fieldCardID.setColumns(10);
		fieldCardID.setBounds(330, 450, 449, 45);
		contentPane.add(fieldCardID);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(330, 493, 449, 2);
		contentPane.add(separator_2_1);
		
		JLabel lblCardID = new JLabel("CCCD:");
		lblCardID.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCardID.setBounds(202, 465, 118, 35);
		contentPane.add(lblCardID);
	}
}
