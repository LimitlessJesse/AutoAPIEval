import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import java.awt.Color;

public class TableColumn_26 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create a JFrame
                JFrame frame = new JFrame("Table Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Create a JTable
                Object[][] data = {
                    {"John", "Doe", "Male", "30"},
                    {"Jane", "Doe", "Female", "28"},
                    {"Peter", "Smith", "Male", "35"},
                    {"Mary", "Johnson", "Female", "40"}
                };
                String[] columnNames = {"First Name", "Last Name", "Gender", "Age"};
                JTable table = new JTable(data, columnNames);

                // Set the header renderer
                for (int i = 0; i < table.getColumnCount(); i++) {
                    TableColumn column = table.getColumnModel().getColumn(i);
                    TableCellRenderer renderer = new DefaultTableCellRenderer();
                    ((DefaultTableCellRenderer) renderer).setBackground(Color.RED);
                    ((DefaultTableCellRenderer) renderer).setForeground(Color.WHITE);
                    column.setHeaderRenderer(renderer);
                }

                // Add the JTable to a JScrollPane
                JScrollPane scrollPane = new JScrollPane(table);

                // Add the JScrollPane to the JFrame
                frame.add(scrollPane);

                // Display the JFrame
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
