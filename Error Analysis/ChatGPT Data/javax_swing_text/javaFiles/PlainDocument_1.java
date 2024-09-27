import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;

public class PlainDocument_1 {
    public static void main(String[] args) {
        PlainDocument document = new PlainDocument();
        AttributeSet attributeSet = null;
        try {
            document.insertString(0, "Hello", attributeSet);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
        System.out.println(document.getText(0, document.getLength()));
    }
}
