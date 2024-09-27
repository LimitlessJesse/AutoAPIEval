import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class TableColumn_18 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create a JFrame
                JFrame frame = new JFrame("Table Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Create a JTable
                Object[][] data = {
                    {"John", "Doe", "Male"},
                    {"Jane", "Doe", "Female"},
                    {"Jim", "Doe", "Male"}
                };
                String[] columnNames = {"First Name", "Last Name", "Gender"};
                JTable table = new JTable(data, columnNames);

                // Get the TableColumn for the "Gender" column
                TableColumn genderColumn = table.getColumnModel().getColumn(2);

                // Create a TableCellRenderer to display the gender
                TableCellRenderer genderRenderer = new DefaultTableCellRenderer();
                genderColumn.setCellRenderer(genderRenderer);

                // Create a TableCellEditor to edit the gender
                TableCellEditor genderEditor = new DefaultTableCellEditor(new JComboBox(new String[] {"Male", "Female"}));
                genderColumn.setCellEditor(genderEditor);

                // Add the JTable to a JScrollPane
                JScrollPane scrollPane = new JScrollPane(table);
                frame.getContentPane().add(scrollPane);

                // Set the size and make the JFrame visible
                frame.setSize(400, 300);
                frame.setVisible(true);
            }
        });
    }
}
