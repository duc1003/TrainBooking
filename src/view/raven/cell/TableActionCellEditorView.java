package view.raven.cell;

import java.awt.Component;

import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class TableActionCellEditorView extends DefaultCellEditor {
	private static final long serialVersionUID = 1L;
	
	private TableActionEvent event;
	
	public TableActionCellEditorView(TableActionEvent event) {
		super(new JCheckBox());
		this.event = event;
	}

	@Override
	public Component getTableCellEditorComponent(JTable jtable, Object value, boolean isSelected, int row, int column) {
		PanelActionView action = new PanelActionView();
		action.initEvent(event, row);
		action.setBackground(jtable.getSelectionBackground());
		return action;
	}
}
