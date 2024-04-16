/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.raven.datechooser.*;


import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 *
 * @author raven
 */
public class AdminAddTrain extends JFrame {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form Main
     */
	static AdminAddTrain frame = new AdminAddTrain();
    public AdminAddTrain() {
        initComponents();
        getContentPane().setBackground(new Color(240, 240, 240));
        dateChooser.addEventDateChooser(new EventDateChooser() {
            @Override
            public void dateSelected(SelectedAction action, SelectedDate date) {
                System.out.println(date.getDay() + "-" + date.getMonth() + "-" + date.getYear());
                if (action.getAction() == SelectedAction.DAY_SELECTED) {
                    dateChooser.hidePopup();
                }
            }
        });
    }

    private void initComponents() {

        dateChooser = new com.raven.datechooser.DateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        JPanel contentPane = new JPanel();
        contentPane.setLayout(null);
        contentPane.setForeground(new Color(34, 139, 34));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(new Color(102, 205, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(contentPane, GroupLayout.PREFERRED_SIZE, 1094, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(contentPane, GroupLayout.PREFERRED_SIZE, 681, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(19, Short.MAX_VALUE))
        );
        btnDate = new javax.swing.JButton();
        btnDate.setBounds(759, 479, 43, 23);
        contentPane.add(btnDate);
        
                btnDate.setText("...");
                fieldDate = new javax.swing.JTextField();
                fieldDate.setBounds(410, 476, 339, 29);
                contentPane.add(fieldDate);
                
                        dateChooser.setTextRefernce(fieldDate);
                        
                        JLabel lblDate = new JLabel("Ngày đi\r\n");
                        lblDate.setFont(new Font("Tahoma", Font.BOLD, 16));
                        lblDate.setBounds(278, 471, 86, 35);
                        contentPane.add(lblDate);
                        
                        JPanel panel = new JPanel();
                        panel.setLayout(null);
                        panel.setBackground(new Color(250, 250, 210));
                        panel.setBounds(0, 0, 1106, 81);
                        contentPane.add(panel);
                        
                        JButton menuHome = new JButton("Trang chủ");
                        menuHome.setForeground(new Color(128, 0, 128));
                        menuHome.setFont(new Font("Tahoma", Font.PLAIN, 18));
                        menuHome.setBounds(114, 29, 120, 41);
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
                        menuFind.setBounds(313, 29, 154, 41);
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
                        menuAdd.setBounds(559, 29, 174, 41);
                        panel.add(menuAdd);
                        
                        JButton MenuLogout = new JButton("Đăng xuất");
                        MenuLogout.setForeground(new Color(128, 0, 128));
                        MenuLogout.setFont(new Font("Tahoma", Font.PLAIN, 18));
                        MenuLogout.setBounds(815, 29, 174, 41);
                        panel.add(MenuLogout);
                        MenuLogout.addActionListener(new ActionListener() {
                			public void actionPerformed(ActionEvent e) {
                			frame.setVisible(false);
                			view.UserLogin.frame.setVisible(true);
                			}
                		});
                        
                        JLabel titleAdd = new JLabel("Thêm chuyến tàu");
                        titleAdd.setForeground(new Color(34, 139, 34));
                        titleAdd.setFont(new Font("Tahoma", Font.BOLD, 24));
                        titleAdd.setBackground(new Color(127, 255, 0));
                        titleAdd.setBounds(397, 92, 233, 35);
                        contentPane.add(titleAdd);
                        
                        JButton btnAdd = new JButton("Thêm");
                        btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 24));
                        btnAdd.setBounds(388, 555, 199, 46);
                        contentPane.add(btnAdd);
                        
                        JLabel lbltrainID = new JLabel("TrainID:\r\n");
                        lbltrainID.setFont(new Font("Tahoma", Font.BOLD, 16));
                        lbltrainID.setBounds(278, 147, 86, 30);
                        contentPane.add(lbltrainID);
                        
                        JLabel lbltrainName = new JLabel("Tên tàu:");
                        lbltrainName.setFont(new Font("Tahoma", Font.BOLD, 16));
                        lbltrainName.setBounds(278, 193, 86, 35);
                        contentPane.add(lbltrainName);
                        
                        JLabel lblfromStation = new JLabel("Ga đi:");
                        lblfromStation.setFont(new Font("Tahoma", Font.BOLD, 16));
                        lblfromStation.setBounds(278, 252, 63, 35);
                        contentPane.add(lblfromStation);
                        
                        JLabel lbltoStation = new JLabel("Ga đến:");
                        lbltoStation.setFont(new Font("Tahoma", Font.BOLD, 16));
                        lbltoStation.setBounds(278, 308, 86, 35);
                        contentPane.add(lbltoStation);
                        
                        JLabel lblSeats = new JLabel("Ghế còn trống:");
                        lblSeats.setFont(new Font("Tahoma", Font.BOLD, 16));
                        lblSeats.setBounds(278, 365, 126, 35);
                        contentPane.add(lblSeats);
                        
                        JLabel lblPrice = new JLabel("Giá vé:");
                        lblPrice.setFont(new Font("Tahoma", Font.BOLD, 16));
                        lblPrice.setBounds(278, 411, 86, 35);
                        contentPane.add(lblPrice);
                        
                        fieldtrainID = new JTextField();
                        fieldtrainID.setColumns(10);
                        fieldtrainID.setBounds(409, 149, 339, 30);
                        contentPane.add(fieldtrainID);
                        
                        fieldtrainName = new JTextField();
                        fieldtrainName.setColumns(10);
                        fieldtrainName.setBounds(408, 195, 340, 35);
                        contentPane.add(fieldtrainName);
                        
                        fieldfromStation = new JTextField();
                        fieldfromStation.setColumns(10);
                        fieldfromStation.setBounds(409, 254, 340, 35);
                        contentPane.add(fieldfromStation);
                        
                        fieldtoStation = new JTextField();
                        fieldtoStation.setColumns(10);
                        fieldtoStation.setBounds(409, 310, 339, 35);
                        contentPane.add(fieldtoStation);
                        
                        fieldSeats = new JTextField();
                        fieldSeats.setColumns(10);
                        fieldSeats.setBounds(409, 365, 340, 34);
                        contentPane.add(fieldSeats);
                        
                        fieldPrice = new JTextField();
                        fieldPrice.setColumns(10);
                        fieldPrice.setBounds(409, 414, 339, 33);
                        contentPane.add(fieldPrice);
                btnDate.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton5ActionPerformed(evt);
                    }
                });
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dateChooser.showPopup();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserFindTrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserFindTrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserFindTrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserFindTrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.datechooser.DateChooser dateChooser;
    private javax.swing.JButton btnDate;
    private javax.swing.JTextField fieldDate;
    private JTextField fieldtrainID;
    private JTextField fieldtrainName;
    private JTextField fieldfromStation;
    private JTextField fieldtoStation;
    private JTextField fieldSeats;
    private JTextField fieldPrice;
}
