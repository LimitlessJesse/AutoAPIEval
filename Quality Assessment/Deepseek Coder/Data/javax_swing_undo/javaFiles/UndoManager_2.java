import javax.swing.undo.UndoManager;
import javax.swing.undo.UndoableEdit;

public class UndoManager_2 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();

        // Perform some edits
        undoManager.edit();

        // Add some edits to the undo manager
        undoManager.undoableEditHappened(new UndoableEdit() {
            @Override
            public void undo() {
                // Code to undo the edit
            }

            @Override
            public void redo() {
                // Code to redo the edit
            }

            @Override
            public boolean canUndo() {
                return true;
            }

            @Override
            public boolean canRedo() {
                return true;
            }

            @Override
            public boolean isSignificant() {
                return true;
            }

            @Override
            public String getPresentationName() {
                return "Edit";
            }

            @Override
            public String getUndoPresentationName() {
                return "Undo Edit";
            }

            @Override
            public String getRedoPresentationName() {
                return "Redo Edit";
            }
        });

        // Redo the last edit
        undoManager.redo();
    }
}
