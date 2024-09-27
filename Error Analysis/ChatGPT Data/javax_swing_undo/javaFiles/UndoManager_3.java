import javax.swing.undo.UndoManager;

public class UndoManager_3 {
    public static void main(String[] args) {
        UndoManager manager = new UndoManager();
        
        // Check if undo operation can be performed
        boolean canUndo = manager.canUndo();
        System.out.println("Can undo: " + canUndo);
    }
}
