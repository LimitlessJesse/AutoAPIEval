import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

public class DefaultTableColumnModel_6 {
    public static void main(String[] args) {
        // Create a DefaultTableColumnModel
        DefaultTableColumnModel columnModel = new DefaultTableColumnModel();

        // Create two TableColumn objects
        TableColumn column1 = new TableColumn();
        TableColumn column2 = new TableColumn();

        // Set the column indices
        column1.setModelIndex(0);
        column2.setModelIndex(1);

        // Add the columns to the column model
        columnModel.addColumn(column1);
        columnModel.addColumn(column2);

        // Print the column indices before moving
        System.out.println("Before moving:");
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            System.out.println("Column " + i + ": " + columnModel.getColumn(i).getModelIndex());
        }

        // Move column1 to target index 1
        columnModel.moveColumn(0, 1);

        // Print the column indices after moving
        System.out.println("After moving:");
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            System.out.println("Column " + i + ": " + columnModel.getColumn(i).getModelIndex());
        }
    }
}
