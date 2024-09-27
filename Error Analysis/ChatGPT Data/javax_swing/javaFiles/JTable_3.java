import javax.swing.JTable;
import javax.swing.table.TableModel;

public class JTable_3 {
    public static void main(String[] args) {
        JTable table = new JTable();
        TableModel dataModel = new TableModel(); // Assuming TableModel is a custom class
        table.setModel(dataModel);
    }
}
