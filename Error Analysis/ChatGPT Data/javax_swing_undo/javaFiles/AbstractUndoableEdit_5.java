import javax.swing.undo.AbstractUndoableEdit;

public class AbstractUndoableEdit_5 {
    public static void main(String[] args) {
        AbstractUndoableEdit edit = new AbstractUndoableEdit() {
            @Override
            public String getUndoPresentationName() {
                return "Undo operation";
            }
        };

        System.out.println(edit.getUndoPresentationName());
    }
}
