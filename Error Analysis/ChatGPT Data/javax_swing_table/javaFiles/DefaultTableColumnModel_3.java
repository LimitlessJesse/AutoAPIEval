import javax.swing.table.DefaultTableColumnModel;

public class DefaultTableColumnModel_3 {
    public static void main(String[] args) {
        DefaultTableColumnModel model = new DefaultTableColumnModel();
        
        // Get the column count
        int columnCount = model.getColumnCount();
        System.out.println("Column Count: " + columnCount);
    }
}
