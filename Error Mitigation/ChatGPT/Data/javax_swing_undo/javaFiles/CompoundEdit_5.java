import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CompoundEdit;

public class CompoundEdit_5 {
    public static void main(String[] args) {
        CompoundEdit compoundEdit = new CompoundEdit();
        
        // Perform some UndoableEdits
        
        try {
            compoundEdit.redo();
        } catch (CannotRedoException e) {
            System.out.println("Cannot redo");
        }
    }
}
