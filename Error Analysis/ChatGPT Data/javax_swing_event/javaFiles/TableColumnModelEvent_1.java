import javax.swing.event.TableColumnModelEvent;

public class TableColumnModelEvent_1 {
    public static void main(String[] args) {
        TableColumnModelEvent event = new TableColumnModelEvent(new Object(), 1, 2);
        int index = event.getFromIndex();
        System.out.println("From Index: " + index);
    }
}
