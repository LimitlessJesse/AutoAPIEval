import javax.swing.DefaultRowSorter;

public class DefaultRowSorter_3 {
    public static void main(String[] args) {
        DefaultRowSorter sorter = new DefaultRowSorter();
        int column = 0;
        boolean sortable = true;
        sorter.setSortable(column, sortable);
    }
}
