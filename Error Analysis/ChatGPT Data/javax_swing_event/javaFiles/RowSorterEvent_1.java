import javax.swing.event.RowSorterEvent;
import javax.swing.RowSorter;

public class RowSorterEvent_1 {
    public static void main(String[] args) {
        RowSorterEvent event = new RowSorterEvent(new RowSorter(null) {
            @Override
            public int getViewRowCount() {
                return 0;
            }

            @Override
            public int convertRowIndexToModel(int index) {
                return 0;
            }

            @Override
            public int convertRowIndexToView(int index) {
                return 0;
            }
        });
        
        RowSorter<?, ?> sorter = event.getSource();
        System.out.println("RowSorter instance: " + sorter);
    }
}
