import javax.swing.undo.UndoManager;

public class UndoManager_3 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();
        System.out.println(undoManager.canUndo());
    }
}
