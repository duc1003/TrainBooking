/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.raven.cell;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Admin
 */
public class TableActionCellRender extends DefaultTableCellRenderer {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean isSelected, boolean bln1, int i, int i1) {
        @SuppressWarnings("unused")
		Component com = super.getTableCellRendererComponent(jtable, o, isSelected, bln1, i, i1);
        
        PanelAction action = new PanelAction();
        if(isSelected == false && i % 2==0) {
        	action.setBackground(Color.white);
        }
        action.setBackground(com.getBackground());
        return action;
    }
    
}
    