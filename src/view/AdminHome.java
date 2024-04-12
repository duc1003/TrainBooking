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

public class AdminHome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static AdminHome frame = new AdminHome();
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
	public AdminHome() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
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
		menuFind.setBounds(268, 42, 154, 41);
		panel.add(menuFind);
		menuFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AdminFindTrain.frame.setVisible(true);
			}
		});
		
		JButton menuAdd = new JButton("Thêm chuyến tàu");
		menuAdd.setForeground(new Color(128, 0, 128));
		menuAdd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuAdd.setBounds(583, 42, 174, 41);
		panel.add(menuAdd);
		menuAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AdminAddTrain.frame.setVisible(true);
			}
		});
		
		menuAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AdminAddTrain.frame.setVisible(true);
			}
		});
		
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
		
		JLabel tileHome1 = new JLabel("Trang chủ quản lý chuyến tàu");
		tileHome1.setForeground(new Color(34, 139, 34));
		tileHome1.setBackground(new Color(127, 255, 0));
		tileHome1.setFont(new Font("Tahoma", Font.BOLD, 24));
		tileHome1.setBounds(358, 130, 368, 35);
		contentPane.add(tileHome1);
		
		JLabel lblContact1 = new JLabel("Liên Hệ: đức và duy");
		lblContact1.setForeground(new Color(255, 255, 0));
		lblContact1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContact1.setBounds(30, 401, 183, 22);
		contentPane.add(lblContact1);
		
		JLabel lblContact2 = new JLabel("SĐT: 0123456789");
		lblContact2.setForeground(new Color(0, 0, 0));
		lblContact2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContact2.setBounds(30, 422, 183, 22);
		contentPane.add(lblContact2);
		
		JLabel titleHome2 = new JLabel("Chào mừng Admin đến với ứng dụng quản lý tàu chúc bạn một ngày mới vui vẻ\r\n");
		titleHome2.setForeground(new Color(165, 42, 42));
		titleHome2.setFont(new Font("Tahoma", Font.BOLD, 20));
		titleHome2.setBounds(127, 189, 867, 55);
		contentPane.add(titleHome2);
	}
}
