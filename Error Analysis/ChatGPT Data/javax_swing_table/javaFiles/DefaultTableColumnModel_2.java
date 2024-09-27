import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

public class DefaultTableColumnModel_2 {
    public static void main(String[] args) {
        DefaultTableColumnModel columnModel = new DefaultTableColumnModel();
        
        TableColumn column1 = new TableColumn(0); // create a new TableColumn
        columnModel.addColumn(column1); // add the column to the column model
        
        TableColumn retrievedColumn = columnModel.getColumn(0); // get the column at index 0
        System.out.println(retrievedColumn);
    }
}
