import javax.swing.undo.UndoManager;
import javax.swing.undo.CannotUndoException;

public class UndoManager_1 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();
        
        // Perform some edits
        
        try {
            undoManager.undo();
        } catch (CannotUndoException e) {
            System.out.println("Cannot undo the edits: " + e.getMessage());
        }
    }
}
