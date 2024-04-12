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
import view.UserProfile;

public class AdminAddTrain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static AdminAddTrain frame = new AdminAddTrain();
	private JTextField fieldtrainID;
	private JTextField fieldtrainName;
	private JTextField fieldfromStation;
	private JTextField fieldtoStation;
	private JTextField fieldSeats;
	private JTextField fieldPrice;
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
	public AdminAddTrain() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(100, 100, 894, 656);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(34, 139, 34));
		contentPane.setBackground(new Color(102, 205, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 250, 210));
		panel.setBounds(0, 0, 1096, 91);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton menuHome = new JButton("Trang chủ");
		menuHome.setForeground(new Color(128, 0, 128));
		menuHome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuHome.setBounds(10, 29, 120, 41);
		panel.add(menuHome);
		menuHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AdminHome.frame.setVisible(true);
			}
		});
		
		
		JButton menuFind = new JButton("Tìm tàu");
		menuFind.setForeground(new Color(128, 0, 128));
		menuFind.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuFind.setBounds(211, 29, 154, 41);
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
		menuAdd.setBounds(452, 29, 174, 41);
		panel.add(menuAdd);
		
		
		JButton MenuLogout = new JButton("Đăng xuất");
		MenuLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AdminLogin.frame.setVisible(true);
			}
		});
		
		MenuLogout.setForeground(new Color(128, 0, 128));
		MenuLogout.setFont(new Font("Tahoma", Font.PLAIN, 18));
		MenuLogout.setBounds(682, 29, 174, 41);
		panel.add(MenuLogout);
		
		JLabel titleAdd = new JLabel("Thêm chuyến tàu");
		titleAdd.setForeground(new Color(34, 139, 34));
		titleAdd.setBackground(new Color(127, 255, 0));
		titleAdd.setFont(new Font("Tahoma", Font.BOLD, 24));
		titleAdd.setBounds(383, 116, 233, 35);
		contentPane.add(titleAdd);
		
		JLabel lbltrainID = new JLabel("TrainID:\r\n");
		lbltrainID.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbltrainID.setBounds(204, 177, 86, 35);
		contentPane.add(lbltrainID);
		
		fieldtrainID = new JTextField();
		fieldtrainID.setColumns(10);
		fieldtrainID.setBounds(369, 181, 339, 30);
		contentPane.add(fieldtrainID);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(369, 210, 339, 10);
		contentPane.add(separator);
		
		JLabel lbltrainName = new JLabel("Tên tàu:");
		lbltrainName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbltrainName.setBounds(204, 239, 86, 35);
		contentPane.add(lbltrainName);
		
		JLabel lblfromStation = new JLabel("Ga đi:");
		lblfromStation.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblfromStation.setBounds(204, 313, 86, 35);
		contentPane.add(lblfromStation);
		
		JLabel lbltoStation = new JLabel("Ga đến:");
		lbltoStation.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbltoStation.setBounds(204, 377, 86, 35);
		contentPane.add(lbltoStation);
		
		JLabel lblSeats = new JLabel("Ghế còn trống:");
		lblSeats.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSeats.setBounds(204, 441, 126, 35);
		contentPane.add(lblSeats);
		
		JLabel lblPrice = new JLabel("Giá vé:");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrice.setBounds(204, 500, 86, 35);
		contentPane.add(lblPrice);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(369, 277, 340, 10);
		contentPane.add(separator_2);
		
		fieldtrainName = new JTextField();
		fieldtrainName.setColumns(10);
		fieldtrainName.setBounds(369, 241, 340, 35);
		contentPane.add(fieldtrainName);
		
		fieldfromStation = new JTextField();
		fieldfromStation.setColumns(10);
		fieldfromStation.setBounds(369, 315, 340, 35);
		contentPane.add(fieldfromStation);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(370, 348, 339, 2);
		contentPane.add(separator_2_1);
		
		fieldtoStation = new JTextField();
		fieldtoStation.setColumns(10);
		fieldtoStation.setBounds(369, 379, 339, 35);
		contentPane.add(fieldtoStation);
		
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setBounds(369, 412, 339, 2);
		contentPane.add(separator_2_1_1);
		
		fieldSeats = new JTextField();
		fieldSeats.setColumns(10);
		fieldSeats.setBounds(368, 445, 340, 30);
		contentPane.add(fieldSeats);
		
		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setBounds(368, 471, 340, 21);
		contentPane.add(separator_2_2);
		
		fieldPrice = new JTextField();
		fieldPrice.setColumns(10);
		fieldPrice.setBounds(369, 503, 339, 33);
		contentPane.add(fieldPrice);
		
		JButton btnAdd = new JButton("Thêm");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnAdd.setBounds(399, 563, 239, 45);
		contentPane.add(btnAdd);
	}
}
