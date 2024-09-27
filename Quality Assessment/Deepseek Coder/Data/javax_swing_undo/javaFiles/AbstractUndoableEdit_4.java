import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.UndoManager;

public class AbstractUndoableEdit_4 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();
        AbstractUndoableEdit undoableEdit = new AbstractUndoableEdit() {
            @Override
            public String getPresentationName() {
                return "Custom Undoable Edit";
            }
        };
        undoManager.postEdit(undoableEdit);
        System.out.println(undoManager.getUndoPresentationName());
    }
}
