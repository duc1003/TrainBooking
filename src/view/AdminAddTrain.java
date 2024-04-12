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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
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
		
		JButton btnNewButton = new JButton("Trang chủ");
		btnNewButton.setForeground(new Color(128, 0, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(10, 29, 120, 41);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AdminHome.frame.setVisible(true);
			}
		});
		
		
		JButton btnngKTi = new JButton("Tìm tàu");
		btnngKTi.setForeground(new Color(128, 0, 128));
		btnngKTi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnngKTi.setBounds(211, 29, 154, 41);
		panel.add(btnngKTi);
//		btnngKTi.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.setVisible(false);
//				UserRegister.frame.setVisible(true);
//			}
//		});
		
		JButton btnngNhpVi = new JButton("Thêm chuyến tàu");
		btnngNhpVi.setForeground(new Color(128, 0, 128));
		btnngNhpVi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnngNhpVi.setBounds(452, 29, 174, 41);
		panel.add(btnngNhpVi);
		
		JButton btnngXut = new JButton("Đăng xuất");
		btnngXut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserLogin.frame.setVisible(true);
			}
		});
		
		btnngXut.setForeground(new Color(128, 0, 128));
		btnngXut.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnngXut.setBounds(682, 29, 174, 41);
		panel.add(btnngXut);
		
		JLabel lblNewLabel = new JLabel("Thêm chuyến tàu");
		lblNewLabel.setForeground(new Color(34, 139, 34));
		lblNewLabel.setBackground(new Color(127, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(383, 116, 233, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblTrainid = new JLabel("TrainID:\r\n");
		lblTrainid.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTrainid.setBounds(204, 177, 86, 35);
		contentPane.add(lblTrainid);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(369, 181, 339, 30);
		contentPane.add(textField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(369, 210, 339, 10);
		contentPane.add(separator);
		
		JLabel lblTrainid_1 = new JLabel("Tên tàu:");
		lblTrainid_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTrainid_1.setBounds(204, 239, 86, 35);
		contentPane.add(lblTrainid_1);
		
		JLabel lblTrainid_2 = new JLabel("Ga đi:");
		lblTrainid_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTrainid_2.setBounds(204, 313, 86, 35);
		contentPane.add(lblTrainid_2);
		
		JLabel lblTrainid_3 = new JLabel("Ga đến:");
		lblTrainid_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTrainid_3.setBounds(204, 377, 86, 35);
		contentPane.add(lblTrainid_3);
		
		JLabel lblTrainid_4 = new JLabel("Ghế còn trống:");
		lblTrainid_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTrainid_4.setBounds(204, 441, 126, 35);
		contentPane.add(lblTrainid_4);
		
		JLabel lblTrainid_5 = new JLabel("Giá vé:");
		lblTrainid_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTrainid_5.setBounds(204, 500, 86, 35);
		contentPane.add(lblTrainid_5);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(369, 277, 340, 10);
		contentPane.add(separator_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(369, 241, 340, 35);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(369, 315, 340, 35);
		contentPane.add(textField_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(370, 348, 339, 2);
		contentPane.add(separator_2_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(369, 379, 339, 35);
		contentPane.add(textField_3);
		
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setBounds(369, 412, 339, 2);
		contentPane.add(separator_2_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(368, 445, 340, 30);
		contentPane.add(textField_4);
		
		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setBounds(368, 471, 340, 21);
		contentPane.add(separator_2_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(369, 503, 339, 33);
		contentPane.add(textField_5);
		
		JButton btnNewButton_1 = new JButton("Thêm");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_1.setBounds(399, 563, 239, 45);
		contentPane.add(btnNewButton_1);
	}
}
