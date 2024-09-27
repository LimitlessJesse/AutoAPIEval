import javax.swing.undo.CannotUndoException;
import javax.swing.undo.CompoundEdit;

public class CompoundEdit_4 {
    public static void main(String[] args) {
        CompoundEdit compoundEdit = new CompoundEdit();
        
        // Perform some edits
        
        try {
            compoundEdit.undo();
        } catch (CannotUndoException e) {
            System.out.println("Cannot undo the edits");
        }
    }
}
