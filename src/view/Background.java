package view;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;

public class Background extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	public static UserLogin frame = new UserLogin();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Background frame = new Background();
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
	public Background() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1016, 573);
		contentPane = new JPanel();
		contentPane.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		contentPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 205, 170));
		panel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setBounds(-48, 0, 1102, 604);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(250, 250, 210));
		panel_1.setBounds(38, 0, 1096, 117);
		panel.add(panel_1);
		
		JButton menuUserLogin = new JButton("Đăng nhập với User");
		menuUserLogin.setForeground(new Color(128, 0, 128));
		menuUserLogin.setFont(new Font("Tahoma", Font.BOLD, 22));
		menuUserLogin.setBounds(58, 43, 257, 41);
		panel_1.add(menuUserLogin);
		
		JButton menuRegister = new JButton("Đăng ký tài khoản User");
		menuRegister.setForeground(new Color(128, 0, 128));
		menuRegister.setFont(new Font("Tahoma", Font.BOLD, 20));
		menuRegister.setBounds(378, 43, 277, 41);
		panel_1.add(menuRegister);
		menuRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserRegister.frame.setVisible(true);
			}
		});
		
		JButton menuAdminLogin = new JButton("Đăng nhập với Admin");
		menuAdminLogin.setForeground(new Color(128, 0, 128));
		menuAdminLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		menuAdminLogin.setBounds(723, 43, 257, 41);
		panel_1.add(menuAdminLogin);
		menuAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AdminLogin.frame.setVisible(true);
			}
		});
		
		JLabel lblbackground = new JLabel();
		lblbackground.setBounds(10, 128, 584, 444);
		panel.add(lblbackground);
		lblbackground.setIcon(new ImageIcon("D:\\Phan tan\\TESTPROJECT\\TrainBooking\\src\\bg1.png"));
		
		JLabel titleLogin = new JLabel("Đăng nhập");
		titleLogin.setForeground(new Color(34, 139, 34));
		titleLogin.setFont(new Font("Tahoma", Font.BOLD, 24));
		titleLogin.setBackground(new Color(127, 255, 0));
		titleLogin.setBounds(778, 188, 155, 35);
		panel.add(titleLogin);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(732, 265, 249, 35);
		panel.add(textField);
		
		JLabel lblName = new JLabel("Username:\r\n");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName.setBounds(604, 263, 86, 35);
		panel.add(lblName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(604, 340, 86, 35);
		panel.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setBounds(732, 343, 249, 33);
		panel.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnLogin.setBounds(759, 431, 194, 45);
		panel.add(btnLogin);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(732, 300, 249, 0);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(732, 375, 249, 0);
		panel.add(separator_1);
	}
}
