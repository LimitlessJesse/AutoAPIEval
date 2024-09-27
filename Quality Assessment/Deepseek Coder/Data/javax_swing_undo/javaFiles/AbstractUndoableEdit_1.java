import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.UndoManager;

public class AbstractUndoableEdit_1 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();
        AbstractUndoableEdit undoableEdit = new AbstractUndoableEdit() {
            @Override
            public void undo() {
                // Your custom undo logic here
                System.out.println("Undo operation performed");
            }
        };

        undoManager.registerUndoableEdit(undoableEdit);
        undoManager.undo(); // This will call the undo() method in the AbstractUndoableEdit
    }
}
