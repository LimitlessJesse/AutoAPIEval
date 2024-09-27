import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.DefaultCellEditor;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class DefaultCellEditor_3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Create a new JFrame
                JFrame frame = new JFrame("DefaultCellEditor_3");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Create a new JTable
                DefaultTableModel model = new DefaultTableModel(new Object[][] {
                    { "Name", "Age" },
                    { "John", 25 },
                    { "Jane", 30 }
                }, new Object[] {
                    "Name", "Age"
                });

                JTable table = new JTable(model);

                // Set the cell editor for the "Age" column
                table.getColumnModel().getColumn(1).setCellEditor(
                    new DefaultCellEditor(new JTextField()));

                // Get the value of the cell editor for the "Age" column
                Object value = table.getCellEditorValue();

                // Show the value in a dialog
                JOptionPane.showMessageDialog(frame, "Cell Editor Value: " + value);

                // Add the JTable to a JScrollPane
                JScrollPane scrollPane = new JScrollPane(table);

                // Add the JScrollPane to the JFrame
                frame.add(scrollPane);

                // Set the size and make the JFrame visible
                frame.setSize(300, 200);
                frame.setVisible(true);
            }
        });
    }
}
