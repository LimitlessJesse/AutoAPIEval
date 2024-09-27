import javax.swing.event.TableModelEvent;

public class TableModelEvent_2 {
    public static void main(String[] args) {
        TableModelEvent event = new TableModelEvent();
        int lastRow = event.getLastRow();
        System.out.println("Last row that changed: " + lastRow);
    }
}
