import javax.swing.RowSorter;

public class RowSorter_SortKey_2 {
    public static void main(String[] args) {
        RowSorter.SortKey sortKey = new RowSorter.SortKey(0, SortOrder.ASCENDING);
        SortOrder order = sortKey.getSortOrder();
        System.out.println(order);
    }
}
