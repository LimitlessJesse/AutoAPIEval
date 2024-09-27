import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class TableColumn_14 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        TableColumn column = new TableColumn(0);
        column.setResizable(false); // set the column to be non-resizable
        model.addColumn(column);
    }
}
