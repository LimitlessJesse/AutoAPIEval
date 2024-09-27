import javax.swing.table.AbstractTableModel;

public class AbstractTableModel_1 {
    public static void main(String[] args) {
        AbstractTableModel model = new AbstractTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                // Here you can customize the logic for cell editable
                // For example, you can make all cells editable
                return true;
            }
        };

        // You can use the model in your JTable
        //...
    }
}
