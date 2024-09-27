import javax.swing.table.DefaultTableModel;

public class DefaultTableModel_4 {
    public static void main(String[] args) {
        // Create a DefaultTableModel
        DefaultTableModel model = new DefaultTableModel();

        // Add columns
        model.addColumn("Column 1");
        model.addColumn("Column 2");

        // Set a value at a specific row and column
        model.setValueAt("Value 1", 0, 0);
        model.setValueAt("Value 2", 0, 1);

        // Print the model
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                System.out.print(model.getValueAt(i, j) + " ");
            }
            System.out.println();
        }
    }
}
