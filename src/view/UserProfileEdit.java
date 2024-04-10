package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class UserProfileEdit extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static UserProfileEdit frame = new UserProfileEdit();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
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
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 985, 522);
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
				UserHome.frame.setVisible(true);
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
		btnngNhpVi.setBounds(343, 42, 174, 41);
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
		btnTiKhon.setBounds(551, 42, 174, 41);
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
		btnngXut.setBounds(763, 42, 174, 41);
		panel.add(btnngXut);
		
		JLabel lblNewLabel = new JLabel("Thông tin cá nhân\r\n");
		lblNewLabel.setForeground(new Color(34, 139, 34));
		lblNewLabel.setBackground(new Color(127, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(636, 140, 233, 35);
		contentPane.add(lblNewLabel);
		
		JButton btnXemThng = new JButton("--> Xem thông tin tài khoản\r\n");
		btnXemThng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserProfile.frame.setVisible(true);
			}
		});
		btnXemThng.setForeground(new Color(255, 0, 0));
		btnXemThng.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnXemThng.setBounds(10, 161, 297, 41);
		contentPane.add(btnXemThng);
		
		JButton btnChnhSa = new JButton("--> Chỉnh sửa thông tin tài khoản\r\n\r\n");
		btnChnhSa.setForeground(Color.RED);
		btnChnhSa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnChnhSa.setBounds(10, 239, 297, 41);
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
		btnThayi.setBounds(10, 313, 297, 41);
		contentPane.add(btnThayi);
		
		JLabel Username = new JLabel("Username:\r\n");
		Username.setFont(new Font("Tahoma", Font.BOLD, 16));
		Username.setBounds(412, 195, 110, 35);
		contentPane.add(Username);
		
		JLabel lblHVTn = new JLabel("Họ và tên:\r\n");
		lblHVTn.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHVTn.setBounds(412, 254, 110, 35);
		contentPane.add(lblHVTn);
		
		JLabel lblSinThoi = new JLabel("Số điện thoại:");
		lblSinThoi.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSinThoi.setBounds(412, 317, 110, 35);
		contentPane.add(lblSinThoi);
		
		JLabel lblCccd = new JLabel("CCCD:\r\n");
		lblCccd.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCccd.setBounds(412, 382, 110, 35);
		contentPane.add(lblCccd);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(539, 197, 395, 35);
		contentPane.add(textField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(538, 229, 396, 2);
		contentPane.add(separator);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(539, 256, 395, 35);
		contentPane.add(textField_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(538, 291, 396, 2);
		contentPane.add(separator_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(539, 317, 395, 35);
		contentPane.add(textField_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(538, 351, 396, 2);
		contentPane.add(separator_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(539, 384, 395, 35);
		contentPane.add(textField_3);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(538, 415, 396, 2);
		contentPane.add(separator_3);
		
		JButton btnNewButton_1 = new JButton("Sửa");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_1.setBounds(691, 430, 110, 45);
		contentPane.add(btnNewButton_1);
	}
}
