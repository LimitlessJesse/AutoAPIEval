import javax.swing.event.CellEditorListener;
import javax.swing.AbstractCellEditor;

public class AbstractCellEditor_4 {
    public static void main(String[] args) {
        AbstractCellEditor editor = new AbstractCellEditor() {
            @Override
            public Object getCellEditorValue() {
                return null;
            }
        };

        CellEditorListener listener = new CellEditorListener() {
            @Override
            public void editingCanceled(ChangeEvent e) {
                // handle event
            }

            @Override
            public void editingStopped(ChangeEvent e) {
                // handle event
            }
        };

        editor.addCellEditorListener(listener);
        editor.removeCellEditorListener(listener);
    }
}
