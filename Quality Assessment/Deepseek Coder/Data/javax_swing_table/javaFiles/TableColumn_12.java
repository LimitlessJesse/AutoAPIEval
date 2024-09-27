import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class TableColumn_12 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        TableColumn column = model.getColumn(0);
        column.setHeaderValue("Column Header");
    }
}
