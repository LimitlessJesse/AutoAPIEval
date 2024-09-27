import javax.swing.undo.AbstractUndoableEdit;

public class AbstractUndoableEdit_3 {
    public static void main(String[] args) {
        MyUndoableEdit edit = new MyUndoableEdit();
        System.out.println(edit.canUndo());
    }

    static class MyUndoableEdit extends AbstractUndoableEdit {
        @Override
        public boolean canUndo() {
            return isSignificant() && super.canUndo();
        }
    }
}
