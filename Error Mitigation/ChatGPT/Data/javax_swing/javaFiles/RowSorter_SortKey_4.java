import javax.swing.RowSorter;

public class RowSorter_SortKey_4 {
    public static void main(String[] args) {
        RowSorter.SortKey key1 = new RowSorter.SortKey(1, SortOrder.ASCENDING);
        RowSorter.SortKey key2 = new RowSorter.SortKey(1, SortOrder.ASCENDING);
        
        boolean result = key1.equals(key2);
        System.out.println("Are key1 and key2 equal? " + result);
    }
}
