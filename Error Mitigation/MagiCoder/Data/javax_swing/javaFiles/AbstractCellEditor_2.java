import javax.swing.AbstractCellEditor;
import javax.swing.JTextField;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import java.awt.Component;
import java.util.EventObject;

public class AbstractCellEditor_2 {
    public static void main(String[] args) {
        JTextField textField = new JTextField();
        AbstractCellEditor editor = new AbstractCellEditor() {
            @Override
            public boolean isCellEditable(EventObject anEvent) {
                return true;
            }

            @Override
            public boolean shouldSelectCell(EventObject anEvent) {
                return true;
            }

            @Override
            public boolean stopCellEditing() {
                return true;
            }

            @Override
            public void cancelCellEditing() {
                super.cancelCellEditing();
            }

            @Override
            public void addCellEditorListener(CellEditorListener l) {

            }

            @Override
            public void removeCellEditorListener(CellEditorListener l) {

            }

            @Override
            public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
                return null;
            }
        };

        editor.cancelCellEditing();
    }
}
