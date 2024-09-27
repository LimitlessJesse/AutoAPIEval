import javax.swing.undo.UndoManager;
import javax.swing.undo.UndoableEdit;

public class UndoManager_4 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();
        UndoableEdit undoableEdit = undoManager.getUndoableEdit();
        undoManager.undo();
        boolean canRedo = undoManager.canRedo();
        System.out.println("Can redo: " + canRedo);
    }
}
