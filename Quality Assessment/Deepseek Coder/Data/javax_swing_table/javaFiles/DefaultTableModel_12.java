import javax.swing.table.DefaultTableModel;

public class DefaultTableModel_12 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnCount(3); // Set the column count to 3
        System.out.println("Column count: " + model.getColumnCount());
    }
}
