import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.CannotUndoException;

public class AbstractUndoableEdit_3 {
    public static void main(String[] args) {
        AbstractUndoableEdit undoableEdit = new AbstractUndoableEdit() {
            @Override
            public void undo() throws CannotUndoException {
                if (!canUndo()) {
                    throw new CannotUndoException();
                }
                setHasBeenDone(false);
                // Subclasses should override to undo the operation represented by this edit.
                // Override should begin with a call to super.undo();
                super.undo();
            }
        };

        try {
            undoableEdit.undo();
        } catch (CannotUndoException e) {
            e.printStackTrace();
        }
    }
}
