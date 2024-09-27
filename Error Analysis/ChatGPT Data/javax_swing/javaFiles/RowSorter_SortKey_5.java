import javax.swing.RowSorter;

public class RowSorter_SortKey_5 {
    public static void main(String[] args) {
        RowSorter.SortKey sortKey = new RowSorter.SortKey(0, SortOrder.ASCENDING);
        int hashCode = sortKey.hashCode();
        System.out.println("Hash code for sort key: " + hashCode);
    }
}
