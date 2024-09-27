import javax.swing.table.DefaultTableColumnModel;

public class DefaultTableColumnModel_5 {
    public static void main(String[] args) {
        DefaultTableColumnModel columnModel = new DefaultTableColumnModel();
        
        // Add some columns to the column model
        
        // Move column at index 1 to newIndex 2
        columnModel.moveColumn(1, 2);
        
        // Display the updated column model
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            System.out.println("Column at index " + i + ": " + columnModel.getColumn(i));
        }
    }
}
