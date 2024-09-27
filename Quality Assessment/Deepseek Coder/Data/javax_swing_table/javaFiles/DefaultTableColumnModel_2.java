import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

public class DefaultTableColumnModel_2 {
    public static void main(String[] args) {
        DefaultTableColumnModel columnModel = new DefaultTableColumnModel();
        TableColumn column1 = new TableColumn();
        column1.setModelIndex(0);
        columnModel.addColumn(column1);

        TableColumn column2 = new TableColumn();
        column2.setModelIndex(1);
        columnModel.addColumn(column2);

        TableColumn column = columnModel.getColumn(1);
        System.out.println("Column Index: " + column.getModelIndex());
    }
}
