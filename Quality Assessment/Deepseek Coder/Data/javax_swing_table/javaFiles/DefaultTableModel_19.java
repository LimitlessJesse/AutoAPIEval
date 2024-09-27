import javax.swing.table.DefaultTableModel;

public class DefaultTableModel_19 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Column1");
        model.addColumn("Column2");

        Object[] rowData = {"Data1", "Data2"};
        model.addRow(rowData);

        // Print the model
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                System.out.print(model.getValueAt(i, j) + " ");
            }
            System.out.println();
        }
    }
}
