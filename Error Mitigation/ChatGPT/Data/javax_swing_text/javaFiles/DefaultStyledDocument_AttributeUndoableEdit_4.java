import javax.swing.text.DefaultStyledDocument.AttributeUndoableEdit;

public class DefaultStyledDocument_AttributeUndoableEdit_4 {
    public static void main(String[] args) {
        AttributeUndoableEdit edit = new AttributeUndoableEdit();
        try {
            edit.undo();
        } catch (CannotUndoException e) {
            System.out.println("Cannot undo the change: " + e.getMessage());
        }
    }
}
