import javax.swing.undo.UndoManager;
import javax.swing.undo.CannotUndoException;

public class UndoManager_1 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();
        try {
            undoManager.undo();
        } catch (CannotUndoException e) {
            e.printStackTrace();
        }
    }
}
