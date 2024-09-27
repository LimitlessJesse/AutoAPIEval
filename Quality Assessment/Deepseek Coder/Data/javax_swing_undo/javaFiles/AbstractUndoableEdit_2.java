import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.UndoManager;

public class AbstractUndoableEdit_2 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();

        AbstractUndoableEdit undoableEdit = new AbstractUndoableEdit() {
            @Override
            public void undo() {
                // Code to undo the changes
            }

            @Override
            public void redo() {
                // Code to redo the changes
            }
        };

        undoManager.registerUndoableEdit(undoableEdit);

        // Undo the changes
        undoManager.undo();

        // Redo the changes
        undoManager.redo();
    }
}
