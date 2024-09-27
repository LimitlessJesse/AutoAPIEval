import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class TableColumn_16 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create a JTable
                Object[][] data = {
                    {"John", "Doe", "Male"},
                    {"Jane", "Doe", "Female"},
                    {"Jim", "Doe", "Male"}
                };
                String[] columnNames = {"First Name", "Last Name", "Gender"};
                JTable table = new JTable(data, columnNames);

                // Get the TableColumn for the "First Name" column
                TableColumn firstNameColumn = table.getColumnModel().getColumn(0);

                // Create a custom TableCellRenderer
                TableCellRenderer renderer = new DefaultTableCellRenderer();
                ((DefaultTableCellRenderer) renderer).setHorizontalAlignment(DefaultTableCellRenderer.CENTER);

                // Set the custom TableCellRenderer for the "First Name" column
                firstNameColumn.setCellRenderer(renderer);

                // Create a JFrame and add the JTable to it
                JFrame frame = new JFrame("Table Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new JScrollPane(table));
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
