import javax.swing.undo.AbstractUndoableEdit;

public class AbstractUndoableEdit_2 {
    public static void main(String[] args) {
        AbstractUndoableEdit edit = new AbstractUndoableEdit() {
            @Override
            public boolean canRedo() {
                return !hasBeenDone();
            }
        };
        
        System.out.println("Can Redo: " + edit.canRedo());
    }
}
