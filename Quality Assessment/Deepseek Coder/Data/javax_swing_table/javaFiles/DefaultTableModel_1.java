import javax.swing.table.DefaultTableModel;

public class DefaultTableModel_1 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Column 1");
        model.addColumn("Column 2");
        model.addColumn("Column 3");

        int columnCount = model.getColumnCount();
        System.out.println("Number of columns: " + columnCount);
    }
}
