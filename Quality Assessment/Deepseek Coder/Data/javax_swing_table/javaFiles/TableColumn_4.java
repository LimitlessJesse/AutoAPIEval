import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class TableColumn_4 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        TableColumn column = new TableColumn(0);
        column.setWidth(100); // Set the width of the column
        model.addColumn(column);
    }
}
