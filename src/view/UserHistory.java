package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Component;

public class UserHistory extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static UserHistory frame = new UserHistory();
	private JTable TableHistory;
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
	public UserHistory() {
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
		
		JButton menuProfile = new JButton("Tài khoản");
		menuProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
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
		
		JLabel titleHistory = new JLabel("Lịch sử mua vé");
		titleHistory.setForeground(new Color(34, 139, 34));
		titleHistory.setBackground(new Color(127, 255, 0));
		titleHistory.setFont(new Font("Tahoma", Font.BOLD, 24));
		titleHistory.setBounds(428, 127, 207, 35);
		contentPane.add(titleHistory);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(89, 221, 965, 218);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setBounds(0, 5, 965, 202);
		scrollPane.setViewportBorder(new EmptyBorder(3, 3, 0, 3));
		panel_1.add(scrollPane);
        
        TableHistory = new JTable(new DefaultTableModel(
        	new Object[][] {
        		{"DSVN001", "10006", "NHATRANG", "SAIGON", "2024-04-26", "17", "250.75"},
        		{"DSVN002", "10004", "SAIGON", "NHATRANG", "2024-05-12", "21", "350.75"},
        		{null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null},
        	},
        	new String[] {
        		"TransportID", "TrainID", "Ga đi", "Ga đến", "Ngày đi", "Ghế ngồi", "Giá"
        	}
        ));
        scrollPane.setViewportView(TableHistory);
        TableHistory.setForeground(Color.DARK_GRAY);
        TableHistory.setFont(new Font("Tahoma", Font.PLAIN, 16));
        TableHistory.setFillsViewportHeight(true);
		
	}
}
