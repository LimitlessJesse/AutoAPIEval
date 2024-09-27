import javax.swing.event.RowSorterEvent;

public class RowSorterEvent_3 {
    public static void main(String[] args) {
        RowSorterEvent event = new RowSorterEvent();
        int previousRowCount = event.getPreviousRowCount();
        System.out.println("Previous row count: " + previousRowCount);
    }
}
