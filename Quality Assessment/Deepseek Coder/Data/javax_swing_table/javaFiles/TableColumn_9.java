import javax.swing.table.TableColumn;
import javax.swing.JTable;

public class TableColumn_9 {
    public static void main(String[] args) {
        JTable table = new JTable();
        TableColumn column = table.getColumnModel().getColumn(0);
        int preferredWidth = column.getPreferredWidth();
        System.out.println("Preferred Width: " + preferredWidth);
    }
}
