import javax.swing.undo.UndoManager;

public class UndoManager_1 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();
        
        // Perform actions that can be undone
        
        undoManager.undo();
    }
}
