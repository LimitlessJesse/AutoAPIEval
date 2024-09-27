import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableModel;

public class TableColumn_20 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        TableColumn column = new TableColumn();
        column.setIdentifier("ID");
        model.addColumn(column);
    }
}
