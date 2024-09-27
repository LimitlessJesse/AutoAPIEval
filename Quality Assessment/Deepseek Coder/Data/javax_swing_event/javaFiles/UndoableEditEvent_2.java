import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoableEdit;

public class UndoableEditEvent_2 {
    public static void main(String[] args) {
        UndoableEditListener listener = new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent event) {
                UndoableEdit edit = event.getEdit();
                // You can now use the UndoableEdit object to undo or redo the edit
            }
        };
    }
}
