import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.UndoManager;

public class AbstractUndoableEdit_3 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();
        AbstractUndoableEdit undoableEdit = new AbstractUndoableEdit() {
            @Override
            public boolean isSignificant() {
                return true;
            }
        };
        undoManager.postEdit(undoableEdit);
        System.out.println(undoableEdit.isSignificant());
    }
}
