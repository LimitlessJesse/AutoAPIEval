import javax.swing.event.TableModelEvent;

public class TableModelEvent_3 {
    public static void main(String[] args) {
        TableModelEvent event = new TableModelEvent(source, row, row, TableModelEvent.INSERT);
        int eventType = event.getType();
        System.out.println("Event Type: " + eventType);
    }
}
