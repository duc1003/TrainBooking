/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.raven.cell;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;

public class PanelActionView extends javax.swing.JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form PanelAction
     */
    public PanelActionView() {
        initComponents();
    }

    public void initEvent(TableActionEvent event, int row) {
    	cmdView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				event.onView(row);
			}
    		
    	});
    }
    
    private void initComponents() {

        cmdView = new view.raven.cell.ActionButton();

        cmdView.setIcon(new ImageIcon("D:\\Phan tan\\TESTPROJECT\\TrainBooking\\src\\view\\raven\\cell\\view.png")); // NOI18N
        cmdView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(cmdView, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(cmdView, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        this.setLayout(layout);
    }        

    private void cmdEditActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       
    private view.raven.cell.ActionButton cmdView;
    // End of variables declaration                   
}
