import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.AttributeSet;

public class DefaultStyledDocument_AttributeUndoableEdit_2 {
    public static void main(String[] args) {
        DefaultStyledDocument doc = new DefaultStyledDocument();
        AttributeSet attrs = doc.getCharacterElement(0).getAttributes();
        DefaultStyledDocument.AttributeUndoableEdit edit = new DefaultStyledDocument.AttributeUndoableEdit(doc, attrs);
        edit.redo();
    }
}
