import javax.swing.table.DefaultTableModel;

public class DefaultTableModel_17 {
    public static void main(String[] args) {
        // Create a DefaultTableModel
        DefaultTableModel model = new DefaultTableModel();

        // Add columns
        model.addColumn("Name");
        model.addColumn("Age");

        // Add rows
        model.addRow(new Object[] {"John", 25});
        model.addRow(new Object[] {"Jane", 30});
        model.addRow(new Object[] {"Doe", 35});

        // Print the table model
        System.out.println(model);

        // Remove the second row
        model.removeRow(1);

        // Print the table model again
        System.out.println(model);
    }
}
