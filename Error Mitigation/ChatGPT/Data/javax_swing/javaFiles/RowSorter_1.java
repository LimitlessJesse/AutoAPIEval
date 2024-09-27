import javax.swing.RowSorter;
import javax.swing.SortOrder;

public class RowSorter_1 {
    public static void main(String[] args) {
        RowSorter.SortKey sortKey = new RowSorter.SortKey(0, SortOrder.ASCENDING);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(sortKey);
        
        // Set the sort keys
        RowSorter rowSorter = new RowSorter();
        rowSorter.setSortKeys(sortKeys);
    }
}
