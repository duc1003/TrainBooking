package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import model.Customer;
//import utils.UserUtils;
import controller.client;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import view.AdminLogin;
import view.UserRegister;

public class UserLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField_1;
	static UserLogin frame = new UserLogin();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
	public UserLogin() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1099, 492);
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
		
		JButton btnNewButton = new JButton("Đăng nhập với User");
		btnNewButton.setForeground(new Color(128, 0, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setBounds(58, 43, 257, 41);
		panel.add(btnNewButton);
		
		JButton btnngKTi = new JButton("Đăng ký tài khoản User");
		btnngKTi.setForeground(new Color(128, 0, 128));
		btnngKTi.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnngKTi.setBounds(378, 43, 277, 41);
		panel.add(btnngKTi);
		btnngKTi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserRegister.frame.setVisible(true);
			}
		});
		
		JButton btnngNhpVi = new JButton("Đăng nhập với Admin");
		btnngNhpVi.setForeground(new Color(128, 0, 128));
		btnngNhpVi.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnngNhpVi.setBounds(723, 43, 257, 41);
		panel.add(btnngNhpVi);
		
		btnngNhpVi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AdminLogin.frame.setVisible(true);
			}
		});
		
		JLabel lbl_close = new JLabel("X");
		lbl_close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lbl_close.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbl_close.setForeground(new Color(241, 57, 83));
		lbl_close.setBounds(1068, 0, 17, 22);
		panel.add(lbl_close);
		
		textField = new JTextField();
		textField.setBounds(303, 183, 449, 45);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(303, 226, 449, 2);
		contentPane.add(separator);
		
		JLabel Username = new JLabel("Username:\r\n");
		Username.setFont(new Font("Tahoma", Font.BOLD, 16));
		Username.setBounds(207, 193, 86, 35);
		contentPane.add(Username);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(207, 276, 86, 35);
		contentPane.add(lblPassword);
		
		textField_1 = new JPasswordField();
		textField_1.setColumns(10);
		textField_1.setBounds(303, 266, 449, 45);
		contentPane.add(textField_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(303, 309, 449, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("Đăng nhập");
		lblNewLabel.setForeground(new Color(34, 139, 34));
		lblNewLabel.setBackground(new Color(127, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(450, 127, 155, 35);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer customer = client.userLogin(textField.getText(), new String(textField_1.getPassword()));
				if(customer != null){
//					UserUtils.setCurrentCustomer(customer);
					UserHome userHome = new UserHome();
//					userHome.display();
					UserLogin.frame.setVisible(false);
				} else {
					textField.setText("fails");
					textField_1.setText("fails");
				}
			}
		});
		btnNewButton_1.setBounds(411, 360, 239, 45);
		contentPane.add(btnNewButton_1);
	}
}
