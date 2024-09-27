import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class TableColumn_7 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel(new Object[][] {}, new String[] { "Column 1", "Column 2" });
        JTable table = new JTable(model);
        TableColumn column = table.getColumnModel().getColumn(0);
        int maxWidth = column.getMaxWidth();
        System.out.println("Max Width: " + maxWidth);
    }
}
