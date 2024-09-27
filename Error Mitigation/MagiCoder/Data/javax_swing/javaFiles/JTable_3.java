import javax.swing.JTable;
import javax.swing.table.TableModel;

public class JTable_3 {
    public static void main(String[] args) {
        // Create a JTable
        JTable table = new JTable(5, 5);

        // Get the TableModel
        TableModel model = table.getModel();

        // Set some values in the table
        model.setValueAt("Value1", 0, 0);
        model.setValueAt("Value2", 1, 1);
        model.setValueAt("Value3", 2, 2);

        // Get the value at a specific cell
        Object value = model.getValueAt(1, 1);
        System.out.println(value);  // Output: Value2
    }
}
