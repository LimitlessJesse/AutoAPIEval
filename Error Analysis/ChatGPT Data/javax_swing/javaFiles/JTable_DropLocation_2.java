import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTable_DropLocation_2 {
    public static void main(String[] args) {
        JTable table = new JTable(new DefaultTableModel(3, 3));
        JTable.DropLocation dropLocation = table.getDropLocation();
        int row = dropLocation.getRow();
        System.out.println("Row: " + row);
    }
}
