import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class DefaultTableModel_1 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        Vector<Object> rowData = new Vector<>();
        rowData.add("Value1");
        rowData.add("Value2");
        rowData.add("Value3");
        
        model.addRow(rowData);
        
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                System.out.print(model.getValueAt(i, j) + " ");
            }
            System.out.println();
        }
    }
}
