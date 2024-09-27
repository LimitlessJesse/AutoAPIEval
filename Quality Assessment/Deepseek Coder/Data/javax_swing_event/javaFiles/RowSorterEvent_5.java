import javax.swing.event.RowSorterEvent;
import javax.swing.event.RowSorterListener;
import javax.swing.table.TableRowSorter;
import java.util.EventListener;

public class RowSorterEvent_5 {
    public static void main(String[] args) {
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(new TableModel());
        sorter.addRowSorterListener(new RowSorterListener() {
            @Override
            public void sorterChanged(RowSorterEvent e) {
                Object source = e.getSource();
                System.out.println("Source of the event: " + source);
            }
        });
    }
}
