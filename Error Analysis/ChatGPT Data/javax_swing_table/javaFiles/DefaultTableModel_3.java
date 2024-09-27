import javax.swing.table.DefaultTableModel;

public class DefaultTableModel_3 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        
        // Fill the model with data
        
        removeRow(model, 0);
    }
    
    public static void removeRow(DefaultTableModel model, int row) {
        model.removeRow(row);
    }
}
