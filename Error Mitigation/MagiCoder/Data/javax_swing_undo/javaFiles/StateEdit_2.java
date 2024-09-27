import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;

public class StateEdit extends AbstractUndoableEdit {

    @Override
    public void redo() {
        if (!canRedo()) {
            throw new CannotRedoException();
        }
        super.redo();
    }

    @Override
    public boolean canRedo() {
        return false;
    }

    @Override
    public void undo() throws CannotUndoException {
        throw new CannotUndoException();
    }

    @Override
    public boolean canUndo() {
        return false;
    }
}
