import javax.swing.table.DefaultTableModel;

public class DefaultTableModel_3 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Age");
        model.addRow(new Object[] {"John", 25});
        model.addRow(new Object[] {"Jane", 30});

        int row = 0;
        int column = 0;
        Object value = model.getValueAt(row, column);
        System.out.println("Value at row " + row + ", column " + column + " is: " + value);
    }
}
