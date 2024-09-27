import javax.swing.JTable;

public class JTable_3 {
    public static void main(String[] args) {
        JTable table = new JTable();
        table.setColumnSelectionAllowed(true);
        System.out.println("Column selection allowed: " + table.getColumnSelectionAllowed());
    }
}
