import javax.swing.table.TableColumn;

public class TableColumn_2 {
    public static void main(String[] args) {
        TableColumn tableColumn = new TableColumn();
        Object headerValue = "Header";
        tableColumn.setHeaderValue(headerValue);
        System.out.println(tableColumn.getHeaderValue());
    }
}
