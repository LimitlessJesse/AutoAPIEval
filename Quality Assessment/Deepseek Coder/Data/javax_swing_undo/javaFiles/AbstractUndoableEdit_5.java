import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.UndoableEdit;

public class AbstractUndoableEdit_5 {
    public static void main(String[] args) {
        UndoableEdit undoableEdit = new AbstractUndoableEdit() {
            @Override
            public String getUndoPresentationName() {
                return "Undo Presentation Name";
            }
        };

        System.out.println(undoableEdit.getUndoPresentationName());
    }
}
