import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class TableColumn_5 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel(new Object[][] {}, new String[] { "Column 1", "Column 2" });
        JTable table = new JTable(model);
        TableColumn column = table.getColumnModel().getColumn(0);
        int minWidth = column.getMinWidth();
        int headerWidth = table.getTableHeader().getWidth();
        int totalWidth = minWidth + headerWidth;
        System.out.println("Total width of the column including header: " + totalWidth);
    }
}
