import javax.swing.table.DefaultTableModel;

public class DefaultTableModel_3 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        model.addRow(new Object[]{"Row 1 Data 1", "Row 1 Data 2", "Row 1 Data 3"});
        model.addRow(new Object[]{"Row 2 Data 1", "Row 2 Data 2", "Row 2 Data 3"});
        
        System.out.println("Before removing row:");
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                System.out.print(model.getValueAt(i, j) + " ");
            }
            System.out.println();
        }
        
        model.removeRow(1);
        
        System.out.println("After removing row:");
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                System.out.print(model.getValueAt(i, j) + " ");
            }
            System.out.println();
        }
    }
}
