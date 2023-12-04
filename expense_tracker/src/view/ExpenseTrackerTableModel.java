package view;
import javax.swing.table.DefaultTableModel;

/**
 * View table class used for overriding the default method and make cell not editable
**/
public class ExpenseTrackerTableModel extends DefaultTableModel
{
    public ExpenseTrackerTableModel(String[] columnNames, int rowCount) {
	super(columnNames, rowCount);
    }

    public boolean isCellEditable(int row, int column) {
	return false;
    }
}
