import javax.swing.table.TableColumn;

public class TableColumn_1 {
    public static void main(String[] args) {
        TableColumn column = new TableColumn();
        column.setMinWidth(100);
        System.out.println("Minimum width set to: " + column.getMinWidth());
    }
}
