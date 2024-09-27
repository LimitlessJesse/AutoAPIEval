import javax.swing.event.RowSorterEvent;
import javax.swing.RowSorter;

public class RowSorterEvent_2 {
    public static void main(String[] args) {
        RowSorterEvent event = new RowSorterEvent(new RowSorter(null));
        RowSorter source = event.getSource();
        System.out.println("Source of the event: " + source);
    }
}
