import javax.swing.JTable;
import javax.swing.table.TableModel;

public class JTable_DropLocation_1 {
    public static void main(String[] args) {
        JTable table = new JTable(5, 5);
        JTable.DropLocation dropLocation = table.getDropLocation();
        int column = dropLocation.getColumn();
        System.out.println("Drop column: " + column);
    }
}
