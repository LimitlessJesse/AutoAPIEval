import javax.swing.event.CellEditorListener;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.TreeCellEditor;

public class DefaultTreeCellEditor_4 {
    public static void main(String[] args) {
        DefaultTreeCellEditor editor = new DefaultTreeCellEditor();
        CellEditorListener listener = new CellEditorListener() {
            // implement methods here
        };
        editor.addCellEditorListener(listener);
        editor.removeCellEditorListener(listener);
    }
}
