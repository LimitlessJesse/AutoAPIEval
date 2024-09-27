import javax.swing.event.RowSorterEvent;

public class RowSorterEvent_4 {
    public static void main(String[] args) {
        RowSorterEvent event = new RowSorterEvent(null, RowSorterEvent.Type.SORTED, 5);
        int previousRowCount = event.getPreviousRowCount();
        System.out.println("Previous Row Count: " + previousRowCount);
    }
}
