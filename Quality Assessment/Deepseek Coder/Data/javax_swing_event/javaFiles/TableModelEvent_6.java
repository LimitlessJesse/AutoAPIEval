import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;

public class TableModelEvent_6 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel(new Object[][] {
            { "1", "2", "3" },
            { "4", "5", "6" },
            { "7", "8", "9" }
        }, new Object[] {
            "Column 1", "Column 2", "Column 3"
        });

        TableModelEvent event = new TableModelEvent(model, 0, 0, TableModelEvent.ALL_COLUMNS, new int[] { 1 });
        int column = event.getColumn();
        System.out.println("The column index is: " + column);
    }
}
