import javax.swing.JTable;

public class JTable_DropLocation_4 {
    public static void main(String[] args) {
        JTable.DropLocation dropLocation = new JTable.DropLocation(null, 0, false);
        boolean isInsertColumn = dropLocation.isInsertColumn();
        System.out.println("isInsertColumn: " + isInsertColumn);
    }
}
