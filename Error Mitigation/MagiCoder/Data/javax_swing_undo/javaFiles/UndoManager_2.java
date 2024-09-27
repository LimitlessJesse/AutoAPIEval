import javax.swing.undo.CannotRedoException;
import javax.swing.undo.UndoManager;

public class UndoManager_2 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();
        try {
            undoManager.redo();
        } catch (CannotRedoException e) {
            e.printStackTrace();
        }
    }
}
