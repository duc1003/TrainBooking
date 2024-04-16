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
import javax.swing.LayoutStyle.ComponentPlacement;

public class PanelAction extends javax.swing.JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form PanelAction
     */
    public PanelAction() {
        initComponents();
    }

    public void initEvent(TableActionEvent event, int row) {
    	cmdEdit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				event.onEdit(row);
			}
    		
    	});
    	cmdDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				event.onDelete(row);
			}
    		
    	});
    }
    
    private void initComponents() {

        cmdEdit = new view.raven.cell.ActionButton();
        cmdDelete = new view.raven.cell.ActionButton();

        cmdEdit.setIcon(new ImageIcon("D:\\Phan tan\\TESTPROJECT\\TrainBooking\\src\\view\\raven\\cell\\edit.png")); // NOI18N
        cmdEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditActionPerformed(evt);
            }
        });

        cmdDelete.setIcon(new ImageIcon("D:\\Phan tan\\TESTPROJECT\\TrainBooking\\src\\view\\raven\\cell\\delete.png")); // NOI18N
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addComponent(cmdEdit, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(cmdDelete, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(cmdEdit, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        		.addComponent(cmdDelete, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );
        this.setLayout(layout);
    }// </editor-fold>                        

    private void cmdEditActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         


    // Variables declaration - do not modify                     
    private view.raven.cell.ActionButton cmdDelete;
    private view.raven.cell.ActionButton cmdEdit;
    // End of variables declaration                   
}
