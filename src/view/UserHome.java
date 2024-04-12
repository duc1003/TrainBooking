package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;

public class UserHome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static UserHome frame = new UserHome();
	/**
	 * Launch the application.
	 */
	public static void display() {
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
	public UserHome() {
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
		
		JButton menuHome = new JButton("Trang chủ");
		menuHome.setForeground(new Color(128, 0, 128));
		menuHome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuHome.setBounds(21, 42, 120, 41);
		panel.add(menuHome);
		
		JButton menuFind = new JButton("Tìm tàu");
		menuFind.setForeground(new Color(128, 0, 128));
		menuFind.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuFind.setBounds(224, 42, 110, 41);
		panel.add(menuFind);
		menuFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserFindTrain.frame.setVisible(true);
			}
		});
		
		JButton menuHistory = new JButton("Lịch sử mua vé");
		menuHistory.setForeground(new Color(128, 0, 128));
		menuHistory.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuHistory.setBounds(420, 42, 174, 41);
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
				UserHome.frame.setVisible(false);
				UserProfile userProfile = new UserProfile();
				userProfile.display();
			}
		});
		menuProfile.setForeground(new Color(128, 0, 128));
		menuProfile.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuProfile.setBounds(650, 42, 174, 41);
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
		menuLogout.setBounds(882, 42, 174, 41);
		panel.add(menuLogout);
		
		JLabel titleHome = new JLabel("Trang chủ mua vé tàu");
		titleHome.setForeground(new Color(34, 139, 34));
		titleHome.setBackground(new Color(127, 255, 0));
		titleHome.setFont(new Font("Tahoma", Font.BOLD, 24));
		titleHome.setBounds(387, 128, 285, 35);
		contentPane.add(titleHome);
		
		JLabel lblContactName = new JLabel("Liên Hệ: đức và duy");
		lblContactName.setForeground(new Color(255, 255, 0));
		lblContactName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContactName.setBounds(30, 401, 183, 22);
		contentPane.add(lblContactName);
		
		JLabel lblContactPhone = new JLabel("SĐT: 0123456789");
		lblContactPhone.setForeground(new Color(0, 0, 0));
		lblContactPhone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContactPhone.setBounds(30, 422, 183, 22);
		contentPane.add(lblContactPhone);
		
		JLabel titleHome2 = new JLabel("Chào mừng bạn đến với ứng dụng đặt vé tàu chúng tôi chúc bạn một ngày mới vui vẻ\r\n");
		titleHome2.setForeground(new Color(165, 42, 42));
		titleHome2.setFont(new Font("Tahoma", Font.BOLD, 20));
		titleHome2.setBounds(98, 189, 867, 55);
		contentPane.add(titleHome2);
	}
}
