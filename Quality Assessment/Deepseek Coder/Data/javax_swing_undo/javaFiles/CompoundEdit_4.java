import javax.swing.undo.CompoundEdit;
import javax.swing.undo.UndoManager;
import javax.swing.undo.UndoableEdit;

public class CompoundEdit_4 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();
        UndoableEdit undoableEdit = new CompoundEdit();

        // Add some significant edits
        undoableEdit.addEdit(new UndoableEdit() {
            public void undo() {
                // Undo logic
            }

            public void redo() {
                // Redo logic
            }

            public boolean isSignificant() {
                return true; // This edit is significant
            }
        });

        // Add some non-significant edits
        undoableEdit.addEdit(new UndoableEdit() {
            public void undo() {
                // Undo logic
            }

            public void redo() {
                // Redo logic
            }

            public boolean isSignificant() {
                return false; // This edit is not significant
            }
        });

        undoManager.registerEdit(undoableEdit);

        // Check if the compound edit is significant
        boolean isSignificant = undoableEdit.isSignificant();
        System.out.println("Is significant: " + isSignificant);
    }
}
