import javax.swing.event.UndoableEditEvent;
import javax.swing.undo.UndoableEdit;

public class UndoableEditEvent_1 {
    public static void main(String[] args) {
        UndoableEditEvent event = new UndoableEditEvent(new Object());
        UndoableEdit edit = event.getEdit();
        System.out.println("UndoableEdit object: " + edit);
    }
}
