import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoableEditSupport;

public class UndoableEditSupport_1 {
    public static void main(String[] args) {
        UndoableEditSupport support = new UndoableEditSupport();
        support.addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                // Handle the undoable edit event
            }
        });
    }
}
