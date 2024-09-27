import javax.swing.text.DefaultStyledDocument;

public class DefaultStyledDocument_AttributeUndoableEdit_3 {
    public static void main(String[] args) {
        DefaultStyledDocument.AttributeUndoableEdit edit = new DefaultStyledDocument.AttributeUndoableEdit();
        try {
            edit.redo();
        } catch (CannotRedoException e) {
            e.printStackTrace();
        }
    }
}
