import javax.swing.event.UndoableEditEvent;
import javax.swing.undo.UndoableEdit;

public class UndoableEditEvent_2 {
    public static void main(String[] args) {
        UndoableEditEvent event = new UndoableEditEvent(this, new CustomUndoableEdit());
        UndoableEdit edit = event.getEdit();
        System.out.println("Undoable edit: " + edit);
    }
}

class CustomUndoableEdit implements UndoableEdit {
    // Implement the required methods of UndoableEdit interface
}
