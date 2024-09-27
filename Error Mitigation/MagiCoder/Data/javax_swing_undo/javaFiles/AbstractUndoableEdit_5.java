import javax.swing.undo.AbstractUndoableEdit;

public class AbstractUndoableEdit_5 {
    public static void main(String[] args) {
        AbstractUndoableEdit undoableEdit = new AbstractUndoableEdit() {
            @Override
            public String getPresentationName() {
                return "My Undoable Edit";
            }
        };

        System.out.println(undoableEdit.getPresentationName());
    }
}
