import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

public class DefaultTableColumnModel_2 {
    public static void main(String[] args) {
        DefaultTableColumnModel columnModel = new DefaultTableColumnModel();
        TableColumn column = new TableColumn();
        
        // Add column to the column model
        columnModel.addColumn(column);
        
        // Remove column from the column model
        columnModel.removeColumn(column);
    }
}
