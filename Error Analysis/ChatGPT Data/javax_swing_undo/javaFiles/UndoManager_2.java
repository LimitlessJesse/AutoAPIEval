import javax.swing.undo.UndoManager;

public class UndoManager_2 {
    public static void main(String[] args) {
        UndoManager manager = new UndoManager();
        
        // Perform some undoable actions
        
        // Redo the last undone action
        manager.redo();
    }
}
