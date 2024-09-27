import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class JTable_1 {
    public static void main(String[] args) {
        JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Column 1");
        model.addColumn("Column 2");
        model.addRow(new Object[]{"Data 1", "Data 2"});
        
        table.setModel(model);
        
        TableModel tableModel = table.getModel();
        System.out.println("Table Model Data:");
        for (int row = 0; row < tableModel.getRowCount(); row++) {
            for (int col = 0; col < tableModel.getColumnCount(); col++) {
                System.out.print(tableModel.getValueAt(row, col) + "\t");
            }
            System.out.println();
        }
    }
}
