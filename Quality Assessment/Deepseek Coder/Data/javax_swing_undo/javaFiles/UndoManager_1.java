import javax.swing.undo.UndoManager;
import javax.swing.undo.UndoableEdit;

public class UndoManager_1 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();

        // Perform some edits
        undoManager.editStarted();
        UndoableEdit edit1 = new UndoableEdit() {
            @Override
            public void undo() {
                System.out.println("Undoing edit 1");
            }

            @Override
            public boolean canUndo() {
                return true;
            }

            @Override
            public void redo() {
                System.out.println("Redoing edit 1");
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
            public long getSequenceNumber() {
                return 0;
            }
        };
        undoManager.postEdit(edit1);

        undoManager.editStarted();
        UndoableEdit edit2 = new UndoableEdit() {
            @Override
            public void undo() {
                System.out.println("Undoing edit 2");
            }

            @Override
            public boolean canUndo() {
                return true;
            }

            @Override
            public void redo() {
                System.out.println("Redoing edit 2");
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
            public long getSequenceNumber() {
                return 0;
            }
        };
        undoManager.postEdit(edit2);

        // Undo the last edit
        undoManager.undo();
    }
}
