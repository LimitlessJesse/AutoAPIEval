import javax.swing.table.AbstractTableModel;

public class AbstractTableModel_7 {
    public static void main(String[] args) {
        AbstractTableModel model = new AbstractTableModel() {
            @Override
            public String getColumnName(int columnIndex) {
                // Implement your logic here
                return "Column " + (columnIndex + 1);
            }
        };

        // Test the method
        System.out.println(model.getColumnName(0));  // Output: Column 1
        System.out.println(model.getColumnName(1));  // Output: Column 2
    }
}
