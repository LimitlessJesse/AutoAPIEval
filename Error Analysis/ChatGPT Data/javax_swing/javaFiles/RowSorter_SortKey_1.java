import javax.swing.RowSorter;

public class RowSorter_SortKey_1 {
    public static void main(String[] args) {
        RowSorter.SortKey sortKey = new RowSorter.SortKey(0, SortOrder.ASCENDING);
        int column = sortKey.getColumn();
        System.out.println("Column index: " + column);
    }
}
