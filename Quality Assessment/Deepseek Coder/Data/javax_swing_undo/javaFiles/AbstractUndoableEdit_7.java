import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.UndoManager;

public class AbstractUndoableEdit_7 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();
        AbstractUndoableEdit undoableEdit = new AbstractUndoableEdit() {
            @Override
            public void undo() {
                // Code to undo the operation
            }

            @Override
            public boolean canUndo() {
                // Check if it's possible to undo the operation
                return undoManager.canUndo();
            }
        };

        undoManager.registerUndoableEdit(undoableEdit);

        System.out.println(undoableEdit.canUndo()); // Prints: true
    }
}
