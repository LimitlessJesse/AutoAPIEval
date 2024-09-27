import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.DefaultCellEditor;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class DefaultCellEditor_4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Create a new JFrame
                JFrame frame = new JFrame("DefaultCellEditor Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Create a new JTable
                JTable table = new JTable();

                // Create a new DefaultTableModel
                DefaultTableModel model = new DefaultTableModel();
                table.setModel(model);

                // Add some data to the model
                model.addColumn("Name");
                model.addColumn("Age");
                model.addRow(new Object[] { "John", 25 });
                model.addRow(new Object[] { "Jane", 30 });

                // Get the DefaultCellEditor for the "Name" column
                TableCellEditor editor = table.getCellEditor(0);

                // Cancel cell editing
                ((DefaultCellEditor) editor).cancelCellEditing();

                // Add the table to the frame
                frame.add(table);

                // Set the frame size and make it visible
                frame.setSize(400, 300);
                frame.setVisible(true);
            }
        });
    }
}
