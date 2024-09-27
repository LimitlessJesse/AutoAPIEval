import javax.swing.event.TableModelEvent;

public class TableModelEvent_2 {
    public static void main(String[] args) {
        TableModelEvent event = new TableModelEvent(null, TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT);
        int lastRow = event.getLastRow();
        System.out.println("Last row: " + lastRow);
    }
}
