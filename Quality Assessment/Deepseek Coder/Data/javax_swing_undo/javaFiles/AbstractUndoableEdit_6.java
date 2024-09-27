import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.UndoManager;

public class AbstractUndoableEdit_6 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();
        AbstractUndoableEdit undoableEdit = new AbstractUndoableEdit() {
            @Override
            public String getRedoPresentationName() {
                return "Redo Presentation Name";
            }
        };
        undoManager.postEdit(undoableEdit);
        System.out.println(undoableEdit.getRedoPresentationName());
    }
}
