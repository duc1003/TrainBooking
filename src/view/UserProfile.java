package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Customer;
import utils.UserUtils;

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
import javax.swing.UIManager;
import view.UserProfileEdit;

public class UserProfile extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static UserProfile frame = new UserProfile();
	private static Customer currentCustomer;
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
	public UserProfile() {
		currentCustomer = UserUtils.getCurrentCustomer();
		if (currentCustomer != null) {
			System.out.println("getCurrentCustomer is successful");
		} else System.out.println("getCurrentCustomer is failed");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 985, 478);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(34, 139, 34));
		contentPane.setBackground(new Color(102, 205, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 250, 210));
		panel.setBounds(0, 0, 1150, 116);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton menuHome = new JButton("Trang chủ");
		menuHome.setForeground(new Color(128, 0, 128));
		menuHome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuHome.setBounds(21, 42, 120, 41);
		panel.add(menuHome);
		menuHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserHome.display();
			}
		});
		
		JButton menuFind = new JButton("Tìm tàu");
		menuFind.setForeground(new Color(128, 0, 128));
		menuFind.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuFind.setBounds(185, 42, 110, 41);
		panel.add(menuFind);
//		btnngKTi.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.setVisible(false);
//				UserRegister.frame.setVisible(true);
//			}
//		});
		
		JButton menuHistory = new JButton("Lịch sử mua vé");
		menuHistory.setForeground(new Color(128, 0, 128));
		menuHistory.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuHistory.setBounds(334, 42, 174, 41);
		panel.add(menuHistory);
		menuHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			UserHistory.frame.setVisible(true);
			}
		});
		
		JButton menuProfile = new JButton("Tài khoản");
		menuProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuProfile.setForeground(new Color(128, 0, 128));
		menuProfile.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuProfile.setBounds(550, 42, 174, 41);
		panel.add(menuProfile);
		
		JButton menuLogout = new JButton("Đăng xuất");
		menuLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserLogin.frame.setVisible(true);
			}
		});
		
		menuLogout.setForeground(new Color(128, 0, 128));
		menuLogout.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuLogout.setBounds(749, 42, 174, 41);
		panel.add(menuLogout);
		
		JLabel titleProfile = new JLabel("Thông tin cá nhân\r\n");
		titleProfile.setForeground(new Color(34, 139, 34));
		titleProfile.setBackground(new Color(127, 255, 0));
		titleProfile.setFont(new Font("Tahoma", Font.BOLD, 24));
		titleProfile.setBounds(636, 140, 233, 35);
		contentPane.add(titleProfile);
		
		JButton btnProfileL = new JButton("--> Xem thông tin tài khoản\r\n");
		btnProfileL.setForeground(new Color(255, 0, 0));
		btnProfileL.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnProfileL.setBounds(10, 158, 297, 41);
		contentPane.add(btnProfileL);
		
		JButton btnUpdateL = new JButton("--> Chỉnh sửa thông tin tài khoản\r\n\r\n");
		btnUpdateL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserProfileEdit.frame.setVisible(true);
			}
		});
		btnUpdateL.setForeground(Color.RED);
		btnUpdateL.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUpdateL.setBounds(10, 230, 297, 41);
		contentPane.add(btnUpdateL);
		
		JButton btnPasswordL = new JButton("--> Thay đổi mật khẩu\r\n\r\n");
		btnPasswordL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserChangePassword.frame.setVisible(true);
			}
		});
		btnPasswordL.setForeground(Color.RED);
		btnPasswordL.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPasswordL.setBounds(10, 317, 297, 41);
		contentPane.add(btnPasswordL);
		
		JLabel lblEmail = new JLabel("Username:\r\n");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmail.setBounds(412, 206, 110, 35);
		contentPane.add(lblEmail);
		
		JLabel lblName = new JLabel("Họ và tên:\r\n");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName.setBounds(412, 265, 110, 35);
		contentPane.add(lblName);
		
		JLabel lblPhone = new JLabel("Số điện thoại:");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPhone.setBounds(412, 321, 110, 35);
		contentPane.add(lblPhone);
		
		JLabel lblCardID = new JLabel("CCCD:\r\n");
		lblCardID.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCardID.setBounds(412, 379, 110, 35);
		contentPane.add(lblCardID);
		
		JLabel viewEmail = new JLabel("\r\n");
		viewEmail.setBackground(UIManager.getColor("Button.highlight"));
		viewEmail.setForeground(new Color(0, 0, 0));
		viewEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		viewEmail.setBounds(597, 207, 346, 30);
		viewEmail.setOpaque(true);
		viewEmail.setText(currentCustomer.getEmail());
		contentPane.add(viewEmail);
		
		JLabel viewName = new JLabel("\r\n");
		viewName.setOpaque(true);
		viewName.setForeground(Color.BLACK);
		viewName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		viewName.setBackground(Color.WHITE);
		viewName.setBounds(597, 266, 346, 30);
		viewName.setText(currentCustomer.getName());
		contentPane.add(viewName);
		
		JLabel viewPhone = new JLabel("\r\n");
		viewPhone.setOpaque(true);
		viewPhone.setForeground(Color.BLACK);
		viewPhone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		viewPhone.setBackground(Color.WHITE);
		viewPhone.setBounds(597, 322, 346, 30);
		viewPhone.setText(currentCustomer.getPhone() + "");
		contentPane.add(viewPhone);
		
		JLabel viewCardID = new JLabel("\r\n");
		viewCardID.setOpaque(true);
		viewCardID.setForeground(Color.BLACK);
		viewCardID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		viewCardID.setBackground(Color.WHITE);
		viewCardID.setBounds(597, 380, 346, 30);
		viewCardID.setText(currentCustomer.getCardID() + "");
		contentPane.add(viewCardID);
	}
}
