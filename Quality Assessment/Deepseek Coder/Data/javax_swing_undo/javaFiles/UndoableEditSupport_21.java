import javax.swing.undo.UndoableEdit;
import javax.swing.undo.UndoableEditListener;
import javax.swing.undo.UndoableEditSupport;

public class UndoableEditSupport_21 {
    public static void main(String[] args) {
        UndoableEditSupport support = new UndoableEditSupport();

        UndoableEditListener listener = new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                // Handle the undoable edit event
            }
        };

        support.addUndoableEditListener(listener);

        // Remove the listener
        support.removeUndoableEditListener(listener);
    }
}
