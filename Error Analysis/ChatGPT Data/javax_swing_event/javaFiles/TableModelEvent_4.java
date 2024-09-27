import javax.swing.event.TableModelEvent;

public class TableModelEvent_4 {
    public static void main(String[] args) {
        TableModelEvent event = new TableModelEvent(new Object(), 1, 2, TableModelEvent.DELETE);
        int eventType = event.getType();
        System.out.println("Event Type: " + eventType);
    }
}
