import javax.swing.undo.CompoundEdit;
import javax.swing.undo.UndoManager;

public class CompoundEdit_2 {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();
        CompoundEdit compoundEdit = new CompoundEdit();
        compoundEdit.addEdit(new MyEdit());
        undoManager.addEdit(compoundEdit);

        System.out.println(compoundEdit.canRedo()); // Output: true
    }
}

class MyEdit extends CompoundEdit {
    @Override
    public boolean canRedo() {
        return super.canRedo();
    }
}
