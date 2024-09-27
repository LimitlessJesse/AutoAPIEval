import javax.swing.DefaultRowSorter;

public class DefaultRowSorter_2 {
    public static void main(String[] args) {
        DefaultRowSorter<Object, Object> rowSorter = new DefaultRowSorter<>();
        int column = 0; // specify the column index
        rowSorter.toggleSortOrder(column);
    }
}
