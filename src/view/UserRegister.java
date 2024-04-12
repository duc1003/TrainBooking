package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.Window;
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

public class UserRegister extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	static UserRegister frame = new UserRegister();

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
	public UserRegister() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1099, 628);
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
		
		JButton btnNewButton = new JButton("Đăng nhập với User");
		btnNewButton.setForeground(new Color(128, 0, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setBounds(58, 43, 257, 41);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserLogin.frame.setVisible(true);
			}
		});
		
		JButton btnngKTi = new JButton("Đăng ký tài khoản User");
		btnngKTi.setForeground(new Color(128, 0, 128));
		btnngKTi.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnngKTi.setBounds(378, 43, 277, 41);
		panel.add(btnngKTi);
		
	
		
		JButton btnngNhpVi = new JButton("Đăng nhập với Admin");
		btnngNhpVi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AdminLogin.frame.setVisible(true);
			}
		});
		btnngNhpVi.setForeground(new Color(128, 0, 128));
		btnngNhpVi.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnngNhpVi.setBounds(723, 43, 257, 41);
		panel.add(btnngNhpVi);
		
		JLabel lbl_close = new JLabel("X");
		lbl_close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lbl_close.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbl_close.setForeground(new Color(241, 57, 83));
		lbl_close.setBounds(1068, 0, 17, 22);
		panel.add(lbl_close);
		
		textField = new JTextField();
		textField.setBounds(330, 173, 449, 45);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(330, 217, 449, 12);
		contentPane.add(separator);
		
		JLabel Username = new JLabel("Username:\r\n");
		Username.setFont(new Font("Tahoma", Font.BOLD, 16));
		Username.setBounds(202, 183, 86, 35);
		contentPane.add(Username);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(202, 249, 86, 35);
		contentPane.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(330, 239, 449, 45);
		contentPane.add(textField_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(330, 282, 449, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("Đăng ký");
		lblNewLabel.setForeground(new Color(34, 139, 34));
		lblNewLabel.setBackground(new Color(127, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(450, 127, 155, 35);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Đăng ký tài khoản");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(418, 541, 239, 45);
		contentPane.add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(330, 309, 449, 45);
		contentPane.add(textField_2);
		
		JLabel lblHVTn = new JLabel("Họ và tên:");
		lblHVTn.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHVTn.setBounds(202, 319, 86, 35);
		contentPane.add(lblHVTn);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(330, 382, 449, 45);
		contentPane.add(textField_3);
		
		JLabel lblSinThoi = new JLabel("Số điện thoại:");
		lblSinThoi.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSinThoi.setBounds(202, 392, 118, 35);
		contentPane.add(lblSinThoi);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(330, 354, 449, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(330, 425, 449, 2);
		contentPane.add(separator_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(330, 450, 449, 45);
		contentPane.add(textField_4);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(330, 493, 449, 2);
		contentPane.add(separator_2_1);
		
		JLabel lblCccd = new JLabel("CCCD:");
		lblCccd.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCccd.setBounds(202, 465, 118, 35);
		contentPane.add(lblCccd);
	}
}
