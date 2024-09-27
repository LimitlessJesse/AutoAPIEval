import javax.swing.JTable;

public class JTable_DropLocation_4 {
    public static void main(String[] args) {
        JTable.DropLocation dropLocation = new JTable.DropLocation(1, 2, true);
        boolean isInsertColumn = dropLocation.isInsertColumn();
        System.out.println("Is insert column: " + isInsertColumn);
    }
}
