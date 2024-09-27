import javax.swing.event.TableColumnModelEvent;

public class TableColumnModelEvent_2 {
    public static void main(String[] args) {
        TableColumnModelEvent event = new TableColumnModelEvent(null, 0, TableColumnModelEvent.INSERT, 2);
        int index = event.getToIndex();
        System.out.println("To Index: " + index);
    }
}
