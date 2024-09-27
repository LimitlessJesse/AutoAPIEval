import javax.swing.table.TableColumn;

public class TableColumn_4 {
    public static void main(String[] args) {
        TableColumn column = new TableColumn();
        column.setResizable(false);
        System.out.println(column.getResizable());
    }
}
