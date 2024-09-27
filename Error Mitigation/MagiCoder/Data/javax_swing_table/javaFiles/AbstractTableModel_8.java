import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModelEvent;

public class AbstractTableModel_8 {
    public static void main(String[] args) {
        MyTableModel model = new MyTableModel();
        model.fireTableDataChanged();
    }
}

class MyTableModel extends AbstractTableModel {
    // Implement other methods of AbstractTableModel

    @Override
    public void fireTableDataChanged() {
        TableModelEvent event = new TableModelEvent(this, TableModelEvent.ALL_COLUMNS, TableModelEvent.ALL_COLUMNS, TableModelEvent.DATA_CHANGED);
        for (TableModelListener l : getTableModelListeners()) {
            l.tableChanged(event);
        }
    }
}
