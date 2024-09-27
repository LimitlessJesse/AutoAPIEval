import javax.swing.JTable;

public class JTable_2 {
    public static void main(String[] args) {
        JTable table = new JTable();
        table.setRowSelectionAllowed(true);
        System.out.println("Row selection allowed: " + table.getRowSelectionAllowed());
    }
}
