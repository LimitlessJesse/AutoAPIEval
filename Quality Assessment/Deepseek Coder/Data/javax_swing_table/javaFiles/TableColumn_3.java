import javax.swing.table.TableColumn;
import javax.swing.JTable;

public class TableColumn_3 {
    public static void main(String[] args) {
        JTable table = new JTable();
        TableColumn column = table.getColumnModel().getColumn(0);
        int width = column.getWidth();
        System.out.println("The width of the column is: " + width);
    }
}
