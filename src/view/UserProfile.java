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
		
		JButton btnNewButton = new JButton("Trang chủ");
		btnNewButton.setForeground(new Color(128, 0, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(21, 42, 120, 41);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserHome.display();
			}
		});
		
		JButton btnngKTi = new JButton("Tìm tàu");
		btnngKTi.setForeground(new Color(128, 0, 128));
		btnngKTi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnngKTi.setBounds(185, 42, 110, 41);
		panel.add(btnngKTi);
//		btnngKTi.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.setVisible(false);
//				UserRegister.frame.setVisible(true);
//			}
//		});
		
		JButton btnngNhpVi = new JButton("Lịch sử mua vé");
		btnngNhpVi.setForeground(new Color(128, 0, 128));
		btnngNhpVi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnngNhpVi.setBounds(334, 42, 174, 41);
		panel.add(btnngNhpVi);
		btnngNhpVi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			UserHistory.frame.setVisible(true);
			}
		});
		
		JButton btnTiKhon = new JButton("Tài khoản");
		btnTiKhon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTiKhon.setForeground(new Color(128, 0, 128));
		btnTiKhon.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTiKhon.setBounds(550, 42, 174, 41);
		panel.add(btnTiKhon);
		
		JButton btnngXut = new JButton("Đăng xuất");
		btnngXut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserLogin.frame.setVisible(true);
			}
		});
		
		btnngXut.setForeground(new Color(128, 0, 128));
		btnngXut.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnngXut.setBounds(749, 42, 174, 41);
		panel.add(btnngXut);
		
		JLabel lblNewLabel = new JLabel("Thông tin cá nhân\r\n");
		lblNewLabel.setForeground(new Color(34, 139, 34));
		lblNewLabel.setBackground(new Color(127, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(636, 140, 233, 35);
		contentPane.add(lblNewLabel);
		
		JButton btnXemThng = new JButton("--> Xem thông tin tài khoản\r\n");
		btnXemThng.setForeground(new Color(255, 0, 0));
		btnXemThng.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnXemThng.setBounds(10, 158, 297, 41);
		contentPane.add(btnXemThng);
		
		JButton btnChnhSa = new JButton("--> Chỉnh sửa thông tin tài khoản\r\n\r\n");
		btnChnhSa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserProfileEdit.frame.setVisible(true);
			}
		});
		btnChnhSa.setForeground(Color.RED);
		btnChnhSa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnChnhSa.setBounds(10, 230, 297, 41);
		contentPane.add(btnChnhSa);
		
		JButton btnThayi = new JButton("--> Thay đổi mật khẩu\r\n\r\n");
		btnThayi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserChangePassword.frame.setVisible(true);
			}
		});
		btnThayi.setForeground(Color.RED);
		btnThayi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThayi.setBounds(10, 317, 297, 41);
		contentPane.add(btnThayi);
		
		JLabel Username = new JLabel("Username:\r\n");
		Username.setFont(new Font("Tahoma", Font.BOLD, 16));
		Username.setBounds(412, 206, 110, 35);
		contentPane.add(Username);
		
		JLabel lblHVTn = new JLabel("Họ và tên:\r\n");
		lblHVTn.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHVTn.setBounds(412, 265, 110, 35);
		contentPane.add(lblHVTn);
		
		JLabel lblSinThoi = new JLabel("Số điện thoại:");
		lblSinThoi.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSinThoi.setBounds(412, 321, 110, 35);
		contentPane.add(lblSinThoi);
		
		JLabel lblCccd = new JLabel("CCCD:\r\n");
		lblCccd.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCccd.setBounds(412, 379, 110, 35);
		contentPane.add(lblCccd);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setBackground(UIManager.getColor("Button.highlight"));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(597, 207, 346, 30);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setText(currentCustomer.getEmail());
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\r\n");
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(597, 266, 346, 30);
		lblNewLabel_1_1.setText(currentCustomer.getName());
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("\r\n");
		lblNewLabel_1_2.setOpaque(true);
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBackground(Color.WHITE);
		lblNewLabel_1_2.setBounds(597, 322, 346, 30);
		lblNewLabel_1_2.setText(currentCustomer.getPhone() + "");
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("\r\n");
		lblNewLabel_1_3.setOpaque(true);
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_3.setBackground(Color.WHITE);
		lblNewLabel_1_3.setBounds(597, 380, 346, 30);
		lblNewLabel_1_3.setText(currentCustomer.getCardID() + "");
		contentPane.add(lblNewLabel_1_3);
	}
}
