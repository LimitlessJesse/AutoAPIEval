import javax.swing.JTable;

public class JTable_DropLocation_2 {
    public static void main(String[] args) {
        JTable.DropLocation dropLocation = new JTable.DropLocation(null, 0, 0);
        int row = dropLocation.getRow();
        System.out.println("Drop row: " + row);
    }
}
