import javax.swing.undo.UndoManager;

public class UndoManager_5 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();
        
        // Perform some undoable actions
        
        undoManager.discardAllEdits();
    }
}
