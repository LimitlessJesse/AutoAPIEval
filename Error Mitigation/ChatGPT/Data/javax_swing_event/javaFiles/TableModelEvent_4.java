import javax.swing.event.TableModelEvent;

public class TableModelEvent_4 {
    public static void main(String[] args) {
        TableModelEvent event = new TableModelEvent(source, firstRow, lastRow, TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT);
        int column = event.getColumn();
        System.out.println("Column: " + column);
    }
}
