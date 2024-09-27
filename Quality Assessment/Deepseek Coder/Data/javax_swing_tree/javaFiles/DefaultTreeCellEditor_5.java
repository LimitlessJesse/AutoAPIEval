import javax.swing.event.CellEditorListener;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultMutableTreeNode;

public class DefaultTreeCellEditor_5 {
    public static void main(String[] args) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode("Root");
        DefaultTreeCellEditor editor = new DefaultTreeCellEditor(node);

        // Create a CellEditorListener
        CellEditorListener listener = new CellEditorListener() {
            @Override
            public void editingCanceled(java.util.EventObject evt) {
                System.out.println("Editing cancelled");
            }

            @Override
            public void editingStopped(java.util.EventObject evt) {
                System.out.println("Editing stopped");
            }
        };

        // Add the listener to the editor
        editor.addCellEditorListener(listener);
    }
}
