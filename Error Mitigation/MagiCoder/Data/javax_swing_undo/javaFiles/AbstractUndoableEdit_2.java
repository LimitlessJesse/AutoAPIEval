import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;

public class AbstractUndoableEdit_2 {
    public static void main(String[] args) {
        AbstractUndoableEdit undoableEdit = new AbstractUndoableEdit() {
            @Override
            public void undo() throws CannotUndoException {
                super.undo();
            }

            @Override
            public void redo() throws CannotRedoException {
                super.redo();
            }

            @Override
            public boolean canUndo() {
                return super.canUndo();
            }

            @Override
            public boolean canRedo() {
                return super.canRedo();
            }
        };

        System.out.println(undoableEdit.canRedo());
    }
}
