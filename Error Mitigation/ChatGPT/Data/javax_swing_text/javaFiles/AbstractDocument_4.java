import javax.swing.text.AbstractDocument;
import javax.swing.text.Position;
import javax.swing.text.BadLocationException;

public class AbstractDocument_4 {
    public static void main(String[] args) {
        AbstractDocument document = new AbstractDocument();
        try {
            Position position = document.createPosition(5);
            System.out.println("Created position at offset 5: " + position.getOffset());
        } catch (BadLocationException e) {
            System.out.println("BadLocationException: " + e.getMessage());
        }
    }
}
