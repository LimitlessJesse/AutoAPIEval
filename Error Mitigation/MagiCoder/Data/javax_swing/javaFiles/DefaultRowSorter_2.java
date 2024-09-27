import javax.swing.RowSorter;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultRowSorter;

public class DefaultRowSorter_2 {
    public static void main(String[] args) {
        // Create a TableModel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Age");
        model.addRow(new Object[] {"John", 25});
        model.addRow(new Object[] {"Jane", 30});
        model.addRow(new Object[] {"Bob", 20});

        // Create a RowSorter
        RowSorter<TableModel> sorter = new DefaultRowSorter<>(model);

        // Set the sort keys
        sorter.setSortKeys(new RowSorter.SortKey[] {
            new RowSorter.SortKey(0, SortOrder.ASCENDING),
            new RowSorter.SortKey(1, SortOrder.DESCENDING)
        });

        // Apply the sort
        sorter.sort();

        // Toggle the sort order for the first column
        sorter.toggleSortOrder(0);

        // Apply the sort again
        sorter.sort();

        // Print the sorted data
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                System.out.print(model.getValueAt(i, j) + " ");
            }
            System.out.println();
        }
    }
}
