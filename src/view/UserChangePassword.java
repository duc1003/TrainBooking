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
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JButton;

public class UserChangePassword extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static UserChangePassword frame;
	private JPasswordField fieldCPassword;
	private JPasswordField fieldNewPassword;
	private JPasswordField fieldNewPassword2;

	/**
	 * Launch the application.
	 */
	public static void display() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new UserChangePassword();
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
	public UserChangePassword() {
		Customer customer = UserUtils.getCurrentCustomer();
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 985, 486);
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
				// UserHome.frame.setVisible(true);
			}
		});

		JButton menuFind = new JButton("Tìm tàu");
		menuFind.setForeground(new Color(128, 0, 128));
		menuFind.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuFind.setBounds(185, 42, 110, 41);
		panel.add(menuFind);
		// btnngKTi.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// frame.setVisible(false);
		// UserRegister.frame.setVisible(true);
		// }
		// });

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
				frame.setVisible(false);
				UserProfile.frame.setVisible(true);
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

		JLabel titleProfilePassword = new JLabel("Thông tin mật khẩu");
		titleProfilePassword.setForeground(new Color(34, 139, 34));
		titleProfilePassword.setBackground(new Color(127, 255, 0));
		titleProfilePassword.setFont(new Font("Tahoma", Font.BOLD, 24));
		titleProfilePassword.setBounds(611, 139, 246, 35);
		contentPane.add(titleProfilePassword);

		JButton btnProfileL = new JButton("--> Xem thông tin tài khoản\r\n");
		btnProfileL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserProfile.frame.setVisible(true);
			}
		});
		btnProfileL.setForeground(new Color(255, 0, 0));
		btnProfileL.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnProfileL.setBounds(10, 153, 297, 41);
		contentPane.add(btnProfileL);

		JButton btnUpdateL = new JButton("--> Chỉnh sửa thông tin tài khoản\r\n\r\n");
		btnUpdateL.setForeground(Color.RED);
		btnUpdateL.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUpdateL.setBounds(10, 250, 297, 41);
		contentPane.add(btnUpdateL);
		btnUpdateL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserProfileEdit.frame.setVisible(true);
			}
		});

		JButton btnPasswordL = new JButton("--> Thay đổi mật khẩu\r\n\r\n");
		btnPasswordL.setForeground(Color.RED);
		btnPasswordL.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPasswordL.setBounds(10, 336, 297, 41);
		contentPane.add(btnPasswordL);

		JLabel lblCPassword = new JLabel("Mật khẩu hiện tại:\r\n");
		lblCPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCPassword.setBounds(347, 195, 201, 35);
		contentPane.add(lblCPassword);

		JLabel lblNewPassword = new JLabel("Mật khẩu mới:");
		lblNewPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewPassword.setBounds(347, 254, 201, 35);
		contentPane.add(lblNewPassword);

		JLabel lblNewPassword2 = new JLabel("Nhập lại mật khẩu mới:\r\n");
		lblNewPassword2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewPassword2.setBounds(347, 317, 201, 35);
		contentPane.add(lblNewPassword2);

		fieldCPassword = new JPasswordField();
		fieldCPassword.setColumns(10);
		fieldCPassword.setBounds(558, 197, 376, 35);
		contentPane.add(fieldCPassword);

		JSeparator separator = new JSeparator();
		separator.setBounds(558, 230, 376, 2);
		contentPane.add(separator);

		fieldNewPassword = new JPasswordField();
		fieldNewPassword.setColumns(10);
		fieldNewPassword.setBounds(558, 256, 376, 35);
		contentPane.add(fieldNewPassword);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(558, 291, 376, 2);
		contentPane.add(separator_1);

		fieldNewPassword2 = new JPasswordField();
		fieldNewPassword2.setColumns(10);
		fieldNewPassword2.setBounds(558, 317, 376, 35);
		contentPane.add(fieldNewPassword2);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(558, 351, 376, 2);
		contentPane.add(separator_2);

		JButton btnPassword = new JButton("Thay đổi mật khẩu");
		btnPassword.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnPassword.setBounds(611, 385, 246, 45);
		btnPassword.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (new String(fieldCPassword.getPassword()).equals(customer.getPassword())
						|| new String(fieldNewPassword.getPassword())
								.equals(new String(fieldNewPassword2.getPassword()))) {
					Customer customerUpdate = customer;
					customerUpdate.setPassword(new String(fieldNewPassword.getPassword()));
					boolean success = client.changePassword(customer);
					if (success) {
						UserHome.display();
						frame.setVisible(false);
					}
				}
			}

		});
		contentPane.add(btnPassword);
	}
}
