package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
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

public class UserProfileEdit extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static UserProfileEdit frame = new UserProfileEdit();
	private JTextField fieldEmail;
	private JTextField fieldName;
	private JTextField fieldPhone;
	private JTextField fieldCardID;
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
	public UserProfileEdit() {
		Customer customer = UserUtils.getCurrentCustomer();
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 985, 522);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(34, 139, 34));
		contentPane.setBackground(new Color(173, 216, 230));
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
				// UserHome.frame.setVisible(true);
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
		menuHistory.setBounds(343, 42, 174, 41);
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
		menuProfile.setBounds(551, 42, 174, 41);
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
		menuLogout.setBounds(763, 42, 174, 41);
		panel.add(menuLogout);
		
		JLabel titleProfile = new JLabel("Thông tin cá nhân\r\n");
		titleProfile.setForeground(new Color(34, 139, 34));
		titleProfile.setBackground(new Color(127, 255, 0));
		titleProfile.setFont(new Font("Tahoma", Font.BOLD, 24));
		titleProfile.setBounds(636, 140, 233, 35);
		contentPane.add(titleProfile);
		
		JButton btnProfileL = new JButton("--> Xem thông tin tài khoản\r\n");
		btnProfileL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserProfile.frame.setVisible(true);
			}
		});
		btnProfileL.setForeground(new Color(255, 0, 0));
		btnProfileL.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnProfileL.setBounds(10, 161, 297, 41);
		contentPane.add(btnProfileL);
		
		JButton btnUpdateL = new JButton("--> Chỉnh sửa thông tin tài khoản\r\n\r\n");
		btnUpdateL.setForeground(Color.RED);
		btnUpdateL.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUpdateL.setBounds(10, 239, 297, 41);
		contentPane.add(btnUpdateL);
		
		JButton btnPasswordL = new JButton("--> Thay đổi mật khẩu\r\n\r\n");
		btnPasswordL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserChangePassword.display();
			}
		});
		btnPasswordL.setForeground(Color.RED);
		btnPasswordL.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPasswordL.setBounds(10, 313, 297, 41);
		contentPane.add(btnPasswordL);
		
		JLabel lblEmail = new JLabel("Username:\r\n");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmail.setBounds(412, 195, 110, 35);
		contentPane.add(lblEmail);
		
		JLabel lblName = new JLabel("Họ và tên:\r\n");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName.setBounds(412, 254, 110, 35);
		contentPane.add(lblName);
		
		JLabel lblPhone = new JLabel("Số điện thoại:");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPhone.setBounds(412, 317, 110, 35);
		contentPane.add(lblPhone);
		
		JLabel lblCardID = new JLabel("CCCD:\r\n");
		lblCardID.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCardID.setBounds(412, 382, 110, 35);
		contentPane.add(lblCardID);
		
		fieldEmail = new JTextField();
		fieldEmail.setColumns(10);
		fieldEmail.setBounds(539, 197, 395, 35);
		fieldEmail.setText(customer.getEmail());
		fieldEmail.setEnabled(false);
		contentPane.add(fieldEmail);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(538, 229, 396, 2);
		contentPane.add(separator);
		
		fieldName = new JTextField();
		fieldName.setColumns(10);
		fieldName.setBounds(539, 256, 395, 35);
		fieldName.setText(customer.getName());
		contentPane.add(fieldName);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(538, 291, 396, 2);
		contentPane.add(separator_1);
		
		fieldPhone = new JTextField();
		fieldPhone.setColumns(10);
		fieldPhone.setBounds(539, 317, 395, 35);
		fieldPhone.setText(customer.getPhone());
		contentPane.add(fieldPhone);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(538, 351, 396, 2);
		contentPane.add(separator_2);
		
		fieldCardID = new JTextField();
		fieldCardID.setColumns(10);
		fieldCardID.setBounds(539, 384, 395, 35);
		fieldCardID.setText(customer.getCardID());
		contentPane.add(fieldCardID);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(538, 415, 396, 2);
		contentPane.add(separator_3);
		
		JButton btnUpdate = new JButton("Sửa");
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnUpdate.setBounds(691, 430, 110, 45);
		contentPane.add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Customer updateCustomer = new Customer();
				updateCustomer.setPassword(customer.getPassword());
				updateCustomer.setCardID(fieldCardID.getText());
				updateCustomer.setEmail(customer.getEmail());
				updateCustomer.setPhone(fieldPhone.getText());
				updateCustomer.setName(fieldName.getText());
				boolean success = client.userUpdate(updateCustomer);
				if (success) {
					UserUtils.setCurrentCustomer(updateCustomer);
					UserHome.display();
					frame.setVisible(false);
				} else {
					btnUpdate.setBackground(new Color(9,9,9));
				}
			}
			
		});
	}
}
