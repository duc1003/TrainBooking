package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

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
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import view.AdminLogin;
import view.UserRegister;
import view.UserProfile;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.table.TableModel;
import javax.swing.border.LineBorder;
import javax.swing.ScrollPaneConstants;

public class UserChooseTrain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static UserChooseTrain frame = new UserChooseTrain();
	private JTable TableChooseTrain;
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
	public UserChooseTrain() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1099, 561);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(34, 139, 34));
		contentPane.setBackground(new Color(102, 205, 170));

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
		menuHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserHome.display();
			}
		});
		
		JButton menuFind = new JButton("Tìm tàu");
		menuFind.setForeground(new Color(128, 0, 128));
		menuFind.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuFind.setBounds(224, 42, 110, 41);
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
				frame.setVisible(false);
				UserProfile.frame.setVisible(true);
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
		
		JLabel titleChooseTrain = new JLabel("Chọn tàu");
		titleChooseTrain.setForeground(new Color(34, 139, 34));
		titleChooseTrain.setBackground(new Color(127, 255, 0));
		titleChooseTrain.setFont(new Font("Tahoma", Font.BOLD, 24));
		titleChooseTrain.setBounds(529, 130, 125, 35);
		contentPane.add(titleChooseTrain);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(89, 221, 965, 218);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setBounds(0, 5, 955, 202);
		scrollPane.setViewportBorder(new EmptyBorder(3, 3, 0, 3));
		panel_1.add(scrollPane);
        
        TableChooseTrain = new JTable(new DefaultTableModel(
        	new Object[][] {
        		{"SNT8", "10001", "NHATRANG", "SAIGON", "", "17", "250.75", "Đặt"},
        		{"SE10", "10002", "SAIGON", "NHATRANG", "", "21", "350.75", "Đặt"},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        	},
        	new String[] {
        		"Tên tàu", "TrainID", "Ga đi", "Ga đến", "Giờ khởi hành", "Ghế còn trống", "Giá vé", "Đặt vé"
        	}
        ));
        TableChooseTrain.setCellSelectionEnabled(true);
        scrollPane.setViewportView(TableChooseTrain);
        TableChooseTrain.setForeground(Color.DARK_GRAY);
        TableChooseTrain.setFont(new Font("Tahoma", Font.PLAIN, 16));
        TableChooseTrain.setFillsViewportHeight(true);
		
	}
}
