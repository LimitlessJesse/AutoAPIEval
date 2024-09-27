import javax.swing.text.AbstractDocument;
import javax.swing.text.BadLocationException;

public class AbstractDocument_2 {
    public static void main(String[] args) {
        AbstractDocument doc = new AbstractDocument();
        try {
            doc.remove(0, 5);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
}
