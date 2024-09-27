import javax.swing.DefaultRowSorter;
import javax.swing.RowSorter;

import java.util.ArrayList;
import java.util.List;

public class DefaultRowSorter_1 {
    public static void main(String[] args) {
        DefaultRowSorter<Object, Object> defaultRowSorter = new DefaultRowSorter<>();

        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
        sortKeys.add(new RowSorter.SortKey(1, SortOrder.DESCENDING));

        defaultRowSorter.setSortKeys(sortKeys);
    }
}
