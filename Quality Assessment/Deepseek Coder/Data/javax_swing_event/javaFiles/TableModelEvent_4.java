import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;

public class TableModelEvent_4 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Column 1");
        model.addColumn("Column 2");
        model.addRow(new Object[] {"Row 1", "Data 1"});
        model.addRow(new Object[] {"Row 2", "Data 2"});

        TableModelEvent event = new TableModelEvent(model, 0);
        int firstRow = event.getFirstRow();
        System.out.println("First Row: " + firstRow);
    }
}
