import javax.swing.undo.UndoManager;

public class UndoManager_4 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();
        undoManager.undo();
        boolean canRedo = undoManager.canRedo();
        System.out.println(canRedo);
    }
}
