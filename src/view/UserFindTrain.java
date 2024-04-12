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

public class UserFindTrain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static UserFindTrain frame = new UserFindTrain();
	private JTextField textField;
	private JTextField textField_1;
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
	public UserFindTrain() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1108, 654);
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
		
		JButton btnNewButton = new JButton("Trang chủ");
		btnNewButton.setForeground(new Color(128, 0, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(21, 42, 120, 41);
		panel.add(btnNewButton);
		
		JButton btnngKTi = new JButton("Tìm tàu");
		btnngKTi.setForeground(new Color(128, 0, 128));
		btnngKTi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnngKTi.setBounds(224, 42, 110, 41);
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
		btnngNhpVi.setBounds(420, 42, 174, 41);
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
				UserHome.frame.setVisible(false);
				UserProfile.frame.setVisible(true);
			}
		});
		btnTiKhon.setForeground(new Color(128, 0, 128));
		btnTiKhon.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTiKhon.setBounds(650, 42, 174, 41);
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
		btnngXut.setBounds(882, 42, 174, 41);
		panel.add(btnngXut);
		
		JLabel lblNewLabel = new JLabel("Tìm vé tàu");
		lblNewLabel.setForeground(new Color(34, 139, 34));
		lblNewLabel.setBackground(new Color(127, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(468, 130, 156, 35);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(357, 253, 340, 35);
		contentPane.add(textField);
		
		JLabel lblTrainid_2 = new JLabel("Ga đi:");
		lblTrainid_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTrainid_2.setBounds(250, 253, 86, 35);
		contentPane.add(lblTrainid_2);
		
		JLabel lblTrainid_3 = new JLabel("Ga đến:");
		lblTrainid_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTrainid_3.setBounds(250, 327, 86, 35);
		contentPane.add(lblTrainid_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(357, 327, 340, 35);
		contentPane.add(textField_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(357, 287, 339, 10);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(357, 358, 339, 10);
		contentPane.add(separator_1);
	}
}
