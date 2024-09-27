import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableModel;

public class TableColumn_6 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        TableColumn column = new TableColumn(0);
        column.setMinWidth(100);
        model.addColumn(column);
    }
}
