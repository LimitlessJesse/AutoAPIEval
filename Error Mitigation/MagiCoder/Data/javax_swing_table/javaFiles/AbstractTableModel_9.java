import javax.swing.table.AbstractTableModel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

public class MyTableModel extends AbstractTableModel {
    private String[] columnNames = {"Column1", "Column2"};
    private Object[][] data = {{"Data1", "Data2"}, {"Data3", "Data4"}};
    private TableModelListener listener;

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    public void setValueAt(Object value, int row, int col) {
        if (value == null)
            return;
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }

    public void addTableModelListener(TableModelListener l) {
        listener = l;
    }

    public void removeTableModelListener(TableModelListener l) {
        listener = null;
    }

    protected void fireTableCellUpdated(int row, int col) {
        if (listener!= null) {
            listener.tableChanged(new TableModelEvent(this, row, col, TableModelEvent.UPDATE));
        }
    }
}
