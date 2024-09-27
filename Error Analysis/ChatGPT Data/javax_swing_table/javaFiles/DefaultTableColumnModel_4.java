import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

public class DefaultTableColumnModel_4 {
    public static void main(String[] args) {
        DefaultTableColumnModel columnModel = new DefaultTableColumnModel();
        
        // Create a sample table column
        TableColumn sampleColumn = new TableColumn();
        sampleColumn.setHeaderValue("Sample Column");
        
        // Add the sample column to the column model
        columnModel.addColumn(sampleColumn);
        System.out.println("Columns before removal: " + columnModel.getColumnCount());
        
        // Remove the sample column
        columnModel.removeColumn(sampleColumn);
        System.out.println("Columns after removal: " + columnModel.getColumnCount());
    }
}
