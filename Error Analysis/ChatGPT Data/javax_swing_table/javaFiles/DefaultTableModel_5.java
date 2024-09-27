import javax.swing.table.DefaultTableModel;

public class DefaultTableModel_5 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Age");
        model.addRow(new Object[]{"Alice", 30});
        
        Object value = model.getValueAt(0, 1); // Get the value at row 0, column 1
        System.out.println("Value at row 0, column 1: " + value);
    }
}
