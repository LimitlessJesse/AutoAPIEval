import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTable_2 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);

        // Add some data to the table
        model.addColumn("Column1");
        model.addColumn("Column2");
        model.addRow(new Object[] { "Row1Value1", "Row1Value2" });
        model.addRow(new Object[] { "Row2Value1", "Row2Value2" });

        // Set a new value at a specific cell
        table.setValueAt("NewValue", 0, 0);

        // Print the updated table
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                System.out.print(model.getValueAt(i, j) + " ");
            }
            System.out.println();
        }
    }
}
