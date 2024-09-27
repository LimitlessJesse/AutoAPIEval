import javax.swing.RowSorter.SortKey;

public class RowSorter_SortKey_2 {
    public static void main(String[] args) {
        SortKey sortKey = new SortKey(0, SortOrder.ASCENDING);
        SortOrder order = sortKey.getSortOrder();
        System.out.println("Sort order: " + order);
    }
}
