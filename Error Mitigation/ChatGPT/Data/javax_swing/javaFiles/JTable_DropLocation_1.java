import javax.swing.JTable;

public class JTable_DropLocation_1 {
    public static void main(String[] args) {
        JTable.DropLocation dropLocation = new JTable.DropLocation(null, 0, 0);
        int column = dropLocation.getColumn();
        System.out.println("Column: " + column);
    }
}
