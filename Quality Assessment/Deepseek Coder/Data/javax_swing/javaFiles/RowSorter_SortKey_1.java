import javax.swing.RowSorter;
import javax.swing.RowSorter.SortKey;

public class RowSorter_SortKey_1 {
    public static void main(String[] args) {
        // Create two SortKey objects
        SortKey sortKey1 = new RowSorter.SortKey(0, 1, true);
        SortKey sortKey2 = new RowSorter.SortKey(0, 1, true);

        // Compare the two SortKey objects
        boolean isEqual = sortKey1.equals(sortKey2);

        // Print the result
        System.out.println("Are the two SortKey objects equal? " + isEqual);
    }
}
