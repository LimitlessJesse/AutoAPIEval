import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class TableColumn_8 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel(new Object[][] {
            { "1", "2", "3" },
            { "4", "5", "6" },
            { "7", "8", "9" },
            { "10", "11", "12" }
        }, new Object[] {
            "Column 1", "Column 2", "Column 3"
        });

        JTable table = new JTable(model);

        for (int i = 0; i < table.getColumnCount(); i++) {
            TableColumn column = table.getColumnModel().getColumn(i);
            column.setMaxWidth(100);
        }
    }
}
