import javax.swing.table.DefaultTableModel;

public class DefaultTableModel_18 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        Object[] data = {"Data1", "Data2", "Data3"};
        model.insertRow(0, data);
    }
}
