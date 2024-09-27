import javax.swing.event.TableModelEvent;

public class TableModelEvent_1 {
    public static void main(String[] args) {
        TableModelEvent event = new TableModelEvent(new Object(), 1);
        int firstRow = event.getFirstRow();
        System.out.println("First Row: " + firstRow);
    }
}
