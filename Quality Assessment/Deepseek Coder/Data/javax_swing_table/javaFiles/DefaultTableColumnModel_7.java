import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

public class DefaultTableColumnModel_7 {
    public static void main(String[] args) {
        DefaultTableColumnModel columnModel = new DefaultTableColumnModel();

        TableColumn column = new TableColumn();
        columnModel.addColumn(column);

        // Set column selection allowed
        column.setColumnSelectionAllowed(true);

        // Check if column selection is allowed
        if (column.isColumnSelectionAllowed()) {
            System.out.println("Column selection is allowed");
        } else {
            System.out.println("Column selection is not allowed");
        }
    }
}
