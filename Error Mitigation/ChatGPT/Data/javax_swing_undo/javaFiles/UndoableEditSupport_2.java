import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoableEditSupport;

public class UndoableEditSupport_2 {
    public static void main(String[] args) {
        UndoableEditSupport editSupport = new UndoableEditSupport();
        UndoableEditListener listener = new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                // Handle undoable edit event
            }
        };
        
        editSupport.removeUndoableEditListener(listener);
    }
}
