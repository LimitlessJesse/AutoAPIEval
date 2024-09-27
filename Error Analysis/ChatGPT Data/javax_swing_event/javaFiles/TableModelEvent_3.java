import javax.swing.event.TableModelEvent;

public class TableModelEvent_3 {
    public static void main(String[] args) {
        TableModelEvent event = new TableModelEvent(new Object(), 1, 2, TableModelEvent.UPDATE, TableModelEvent.INSERT);
        int column = event.getColumn();
        System.out.println("Column: " + column);
    }
}
