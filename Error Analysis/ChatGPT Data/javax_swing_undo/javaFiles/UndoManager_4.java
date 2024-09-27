import javax.swing.undo.UndoManager;

public class UndoManager_4 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();
        boolean canRedo = undoManager.canRedo();
        System.out.println("Can Redo: " + canRedo);
    }
}
