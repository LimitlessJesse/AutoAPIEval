import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class TableModelEvent_7 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Age");

        TableModelListener listener = new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                int type = e.getType();
                System.out.println("TableModelEvent type: " + type);
            }
        };

        model.addTableModelListener(listener);

        // Adding a row to the table
        Object[] rowData = {"John", 25};
        model.addRow(rowData);
    }
}
