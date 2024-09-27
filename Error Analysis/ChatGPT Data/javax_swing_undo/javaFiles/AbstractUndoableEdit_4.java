import javax.swing.undo.AbstractUndoableEdit;

public class AbstractUndoableEdit_4 {
    public static void main(String[] args) {
        AbstractUndoableEdit edit = new AbstractUndoableEdit() {
            @Override
            public String getRedoPresentationName() {
                return "Redo Action";
            }
        };
        
        System.out.println(edit.getRedoPresentationName());
    }
}
