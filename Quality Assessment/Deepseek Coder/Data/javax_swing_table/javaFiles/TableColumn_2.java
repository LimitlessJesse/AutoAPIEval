import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableModel;

public class TableColumn_2 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        TableColumn column = new TableColumn();
        
        // Set the model index of the column
        column.setModelIndex(0);
        
        // Add the column to the model
        model.addColumn(column);
        
        // Print the model index of the column
        System.out.println("Model index of the column: " + column.getModelIndex());
    }
}
