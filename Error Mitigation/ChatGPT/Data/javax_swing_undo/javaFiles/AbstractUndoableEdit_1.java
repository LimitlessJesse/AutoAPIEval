import javax.swing.undo.AbstractUndoableEdit;

public class AbstractUndoableEdit_1 {
    public static void main(String[] args) {
        MyUndoableEdit edit = new MyUndoableEdit();
        edit.die();
    }

    static class MyUndoableEdit extends AbstractUndoableEdit {
        public void die() {
            alive = false;
        }
    }
}
