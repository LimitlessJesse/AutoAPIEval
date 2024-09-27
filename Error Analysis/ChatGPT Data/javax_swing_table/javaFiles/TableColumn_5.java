import javax.swing.table.TableColumn;

public class TableColumn_5 {
    public static void main(String[] args) {
        TableColumn tableColumn = new TableColumn();
        Object identifier = "ColumnIdentifier";
        tableColumn.setIdentifier(identifier);
        System.out.println("Identifier set successfully: " + tableColumn.getIdentifier());
    }
}
