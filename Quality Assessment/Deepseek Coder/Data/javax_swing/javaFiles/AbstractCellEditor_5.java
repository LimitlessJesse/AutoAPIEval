import javax.swing.AbstractCellEditor;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.event.CellEditorListener;
import javax.swing.table.DefaultTableModel;

public class AbstractCellEditor_5 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create a new JFrame
                JFrame frame = new JFrame("CellEditorListener Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Create a new JTable
                DefaultTableModel model = new DefaultTableModel(new Object[][] {
                    { "Cell 1", "Cell 2" },
                    { "Cell 3", "Cell 4" }
                }, new Object[] { "Column 1", "Column 2" });

                JTable table = new JTable(model);

                // Create a new JScrollPane to hold the JTable
                JScrollPane scrollPane = new JScrollPane(table);

                // Add the JScrollPane to the JFrame
                frame.getContentPane().add(scrollPane);

                // Get the AbstractCellEditor from the JTable
                AbstractCellEditor editor = (AbstractCellEditor) table.getCellEditor();

                // Add a CellEditorListener to the AbstractCellEditor
                editor.addCellEditorListener(new CellEditorListener() {
                    @Override
                    public void editingCanceled(java.util.EventObject evt) {
                        System.out.println("Editing cancelled");
                    }

                    @Override
                    public void editingStopped(java.util.EventObject evt) {
                        System.out.println("Editing stopped");
                    }
                });

                // Set the size and make the JFrame visible
                frame.setSize(300, 200);
                frame.setVisible(true);
            }
        });
    }
}
