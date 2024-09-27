import javax.swing.table.TableColumn;

public class TableColumn_2 {
    public static void main(String[] args) {
        TableColumn column = new TableColumn();
        column.setResizable(true);
        System.out.println("Column resizable: " + column.getResizable());
    }
}
