import javax.swing.table.AbstractTableModel;

public class AbstractTableModel_5 {
    public static void main(String[] args) {
        AbstractTableModel model = new AbstractTableModel() {
            @Override
            public String getColumnName(int column) {
                return String.valueOf((char)('A' + column));
            }
        };

        System.out.println(model.getColumnName(0)); // Output: A
        System.out.println(model.getColumnName(1)); // Output: B
        System.out.println(model.getColumnName(25)); // Output: Z
        System.out.println(model.getColumnName(26)); // Output: AA
    }
}
