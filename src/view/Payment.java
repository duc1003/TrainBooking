package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import constant.Constant;
import model.History;
import utils.UserUtils;

public class Payment extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fieldCardNumber;
	private JTextField fieldEDate;
	private JTextField fieldCVCode;
	private JTextField fieldCardOwner;
	public static Payment frame;
	public static int trainId = 0;

	/**
	 * Launch the application.
	 */
	public static void display(int trainID) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trainId = trainID;
					System.out.println(trainID + "");
					frame = new Payment();
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
	public Payment() {
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 571);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 638, 110);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel imgVisa = new JLabel("");
		imgVisa.setBounds(10, 11, 128, 88);
		imgVisa.setIcon(new ImageIcon(Constant.PATH_BG_VISA));
		panel.add(imgVisa);
		
		JLabel imgMasterCard = new JLabel("");
		imgMasterCard.setIcon(new ImageIcon(Constant.PATH_BG_MASTERCARD));
		imgMasterCard.setBounds(184, 11, 128, 88);
		panel.add(imgMasterCard);
		
		JLabel lblCardNumber = new JLabel("CARD NUMBER\r\n");
		lblCardNumber.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCardNumber.setBounds(22, 121, 159, 34);
		contentPane.add(lblCardNumber);
		
		fieldCardNumber = new JTextField();
		fieldCardNumber.setBorder(new LineBorder(new Color(171, 173, 179)));
		fieldCardNumber.setBounds(22, 167, 572, 46);
		contentPane.add(fieldCardNumber);
		fieldCardNumber.setColumns(10);
		
		JButton btnNouse = new JButton("");
		btnNouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNouse.setBounds(590, 167, 25, 46);
		contentPane.add(btnNouse);
		
		JLabel lblExpirationDate = new JLabel("EXPIRATION DATE");
		lblExpirationDate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblExpirationDate.setBounds(22, 235, 196, 34);
		contentPane.add(lblExpirationDate);
		
		fieldEDate = new JTextField();
		fieldEDate.setBorder(new LineBorder(new Color(171, 173, 179)));
		fieldEDate.setColumns(10);
		fieldEDate.setBounds(22, 280, 311, 46);
		contentPane.add(fieldEDate);
		
		JLabel lblCVCode = new JLabel("CV CODE\r\n");
		lblCVCode.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCVCode.setBounds(391, 235, 95, 34);
		contentPane.add(lblCVCode);
		
		fieldCVCode = new JTextField();
		fieldCVCode.setBorder(new LineBorder(new Color(171, 173, 179)));
		fieldCVCode.setColumns(10);
		fieldCVCode.setBounds(391, 280, 224, 46);
		contentPane.add(fieldCVCode);
		
		JLabel lblCardOwner = new JLabel("CARD OWNER\r\n\r\n");
		lblCardOwner.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCardOwner.setBounds(22, 349, 147, 34);
		contentPane.add(lblCardOwner);
		
		fieldCardOwner = new JTextField();
		fieldCardOwner.setBorder(new LineBorder(new Color(171, 173, 179)));
		fieldCardOwner.setColumns(10);
		fieldCardOwner.setBounds(22, 394, 592, 46);
		contentPane.add(fieldCardOwner);
		
		JButton btnNewButton = new JButton("XÁC NHẬN THANH TOÁN\r\n");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(22, 465, 593, 58);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String cardID = UserUtils.getCurrentCustomer().getCardID();
				History history = new History();
				history.setTransportID("EE-AAAAAA");
				history.setCardID(cardID);
				history.setTrainID(trainId);
				history.setSeat(10);
				if (controller.client.createHistory(history)) {
					UserHome.display();
					frame.setVisible(true);
				}
			}
			
		});
	}
}
