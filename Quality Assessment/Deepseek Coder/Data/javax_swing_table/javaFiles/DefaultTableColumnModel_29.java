import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

public class DefaultTableColumnModel_29 {
    public static void main(String[] args) {
        DefaultTableColumnModel columnModel = new DefaultTableColumnModel();
        TableColumn column = new TableColumn();
        columnModel.addColumn(column);
        int margin = column.getColumnMargin();
        System.out.println("Column Margin: " + margin);
    }
}
