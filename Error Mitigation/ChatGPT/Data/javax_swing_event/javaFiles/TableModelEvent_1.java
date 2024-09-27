import javax.swing.event.TableModelEvent;

public class TableModelEvent_1 {
    public static void main(String[] args) {
        TableModelEvent event = new TableModelEvent(source, firstRow, lastRow, column, type);
        int firstRowChanged = event.getFirstRow();
        System.out.println("First row changed: " + firstRowChanged);
    }
}
