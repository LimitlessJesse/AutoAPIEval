import javax.swing.AbstractCellEditor;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class AbstractCellEditor_4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("AbstractCellEditor_4");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                DefaultTableModel model = new DefaultTableModel(new Object[][] {
                    { "Cell 1", "Cell 2" },
                    { "Cell 3", "Cell 4" }
                }, new Object[] {
                    "Column 1", "Column 2"
                });

                JTable table = new JTable(model);
                frame.add(table);

                frame.pack();
                frame.setVisible(true);

                AbstractCellEditor editor = new AbstractCellEditor() {
                    @Override
                    public void cancelCellEditing() {
                        super.cancelCellEditing();
                        System.out.println("Cell editing cancelled");
                    }
                };

                table.setCellEditor(editor);
                table.setEditingCell(0, 0, true);
                table.cancelCellEditing();
            }
        });
    }
}
