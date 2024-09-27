import javax.swing.DefaultRowSorter;
import javax.swing.RowFilter;
import javax.swing.SortOrder;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;

public class DefaultRowSorter_3 {
    public static void main(String[] args) {
        // Create a TableModel
        TableModel model = new DefaultTableModel(new Object[][] {
            {"1", "A"},
            {"2", "B"},
            {"3", "C"}
        }, new String[] {
            "Column1", "Column2"
        });

        // Create a DefaultRowSorter
        DefaultRowSorter sorter = new DefaultRowSorter(model);

        // Create a SortKey
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));

        // Set the SortKeys
        sorter.setSortKeys(sortKeys);

        // Sort the rows
        sorter.sort();

        // Print the sorted rows
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                System.out.print(model.getValueAt(i, j) + " ");
            }
            System.out.println();
        }
    }
}
