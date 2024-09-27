import javax.swing.event.TableColumnModelEvent;

public class TableColumnModelEvent_2 {
    public static void main(String[] args) {
        TableColumnModelEvent event = new TableColumnModelEvent(new Object(), 0, 1);
        int toIndex = event.getToIndex();
        System.out.println("To Index: " + toIndex);
    }
}
