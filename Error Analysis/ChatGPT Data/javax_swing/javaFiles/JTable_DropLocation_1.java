import javax.swing.DropMode;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTable_DropLocation_1 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel(new Object[][] { { "Row 1, Col 1", "Row 1, Col 2" },
                { "Row 2, Col 1", "Row 2, Col 2" } }, new Object[] { "Column 1", "Column 2" });

        JTable table = new JTable(model);

        JTable.DropLocation dropLocation = new JTable.DropLocation(10, 5);

        int column = dropLocation.getColumn();

        System.out.println("Dropped at column: " + column);
    }
}
