import javax.swing.table.DefaultTableModel;

public class DefaultTableModel_1 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        Object[] rowData = {"John", "Doe", 30};
        model.addRow(rowData);
        
        // Display the table model data
        for (int row = 0; row < model.getRowCount(); row++) {
            for (int col = 0; col < model.getColumnCount(); col++) {
                System.out.print(model.getValueAt(row, col) + "\t");
            }
            System.out.println();
        }
    }
}
