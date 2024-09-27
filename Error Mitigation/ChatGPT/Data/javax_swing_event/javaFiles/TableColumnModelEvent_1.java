import javax.swing.event.TableColumnModelEvent;

public class TableColumnModelEvent_1 {
    public static void main(String[] args) {
        TableColumnModelEvent event = new TableColumnModelEvent(new Object(), 0, 1);
        int fromIndex = event.getFromIndex();
        System.out.println("From Index: " + fromIndex);
    }
}
