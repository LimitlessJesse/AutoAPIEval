import javax.swing.table.DefaultTableModel;

public class DefaultTableModel_11 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        model.setRowCount(5);
        System.out.println("Number of rows: " + model.getRowCount());
    }
}
