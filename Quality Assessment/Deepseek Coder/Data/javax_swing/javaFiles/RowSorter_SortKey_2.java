import javax.swing.RowSorter;
import javax.swing.RowSorter.SortKey;

public class RowSorter_SortKey_2 {
    public static void main(String[] args) {
        RowSorter.SortKey<String> sortKey = new RowSorter.SortKey<>("columnName", SortKey.ASCENDING);
        int hashCode = sortKey.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
