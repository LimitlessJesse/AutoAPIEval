import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.Element;

public class DefaultStyledDocument_AttributeUndoableEdit_1 {
    public static void main(String[] args) {
        DefaultStyledDocument doc = new DefaultStyledDocument();
        Element elem = doc.getDefaultRootElement();
        AttributeSet attrs = elem.getAttributes();

        // Make some changes to the attributes
        //...

        // Create an AttributeUndoableEdit
        DefaultStyledDocument.AttributeUndoableEdit edit = new DefaultStyledDocument.AttributeUndoableEdit(elem);
        edit.setAttributes(attrs);

        // Undo the changes
        edit.undo();
    }
}
