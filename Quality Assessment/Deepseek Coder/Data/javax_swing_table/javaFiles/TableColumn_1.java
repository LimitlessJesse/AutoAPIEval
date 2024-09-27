import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class TableColumn_1 {
    public static void main(String[] args) {
        // Create a DefaultTableModel
        DefaultTableModel model = new DefaultTableModel();

        // Add columns to the model
        model.addColumn("Column 1");
        model.addColumn("Column 2");
        model.addColumn("Column 3");

        // Get the first column from the model
        TableColumn column = model.getColumn(0);

        // Get the model index of the column
        int modelIndex = column.getModelIndex();

        // Print the model index
        System.out.println("Model Index: " + modelIndex);
    }
}
