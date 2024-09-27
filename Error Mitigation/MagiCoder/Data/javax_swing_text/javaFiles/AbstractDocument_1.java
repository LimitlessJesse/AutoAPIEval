import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class AbstractDocument_1 {
    public static void main(String[] args) {
        Document document = new AbstractDocument();
        try {
            document.insertString(0, "Hello, World!", null);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
}
