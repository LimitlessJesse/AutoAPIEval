import javax.swing.JTable;

public class JTable_DropLocation_3 {
    public static void main(String[] args) {
        JTable.DropLocation dropLocation = new JTable.DropLocation(1, 2, true);
        boolean isInsertRow = dropLocation.isInsertRow();
        System.out.println("Is insert row: " + isInsertRow);
    }
}
