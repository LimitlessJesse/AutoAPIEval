import javax.swing.table.DefaultTableModel;

public class DefaultTableModel_2 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Column 1");
        model.addColumn("Column 2");
        model.addRow(new Object[] {"Cell 1", "Cell 2"});
        model.addRow(new Object[] {"Cell 3", "Cell 4"});
        
        int rowCount = model.getRowCount();
        System.out.println("Number of rows: " + rowCount);
    }
}
