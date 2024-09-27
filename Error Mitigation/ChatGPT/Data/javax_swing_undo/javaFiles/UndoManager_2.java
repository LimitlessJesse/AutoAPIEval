import javax.swing.undo.UndoManager;
import javax.swing.undo.CannotRedoException;

public class UndoManager_2 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();
        
        // Perform some edits
        
        try {
            undoManager.redo();
        } catch (CannotRedoException e) {
            System.out.println("Cannot redo the edits");
        }
    }
}
