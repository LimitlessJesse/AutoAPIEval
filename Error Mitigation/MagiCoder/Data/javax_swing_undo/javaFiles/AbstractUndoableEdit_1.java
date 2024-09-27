import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.CannotUndoException;

public class AbstractUndoableEdit_1 {
    public static void main(String[] args) {
        MyUndoableEdit edit = new MyUndoableEdit();
        System.out.println(edit.canUndo()); // Outputs: false
        try {
            edit.undo();
        } catch (CannotUndoException e) {
            e.printStackTrace();
        }
        System.out.println(edit.canUndo()); // Outputs: false
    }
}

class MyUndoableEdit extends AbstractUndoableEdit {
    @Override
    public boolean canUndo() {
        return super.canUndo();
    }
}
