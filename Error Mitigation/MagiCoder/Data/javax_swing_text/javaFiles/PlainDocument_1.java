import javax.swing.text.PlainDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

public class PlainDocument_1 {
    public static void main(String[] args) {
        PlainDocument doc = new PlainDocument();
        try {
            doc.insertString(0, "Hello, World!", null);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
}
