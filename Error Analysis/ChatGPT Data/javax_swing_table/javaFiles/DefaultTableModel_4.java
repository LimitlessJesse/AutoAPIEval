import javax.swing.table.DefaultTableModel;

public class DefaultTableModel_4 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Column 1", "Column 2", "Column 3"});
        
        // Setting row count using setRowCount method
        model.setRowCount(5);
        
        System.out.println("Number of rows in the table: " + model.getRowCount());
    }
}
