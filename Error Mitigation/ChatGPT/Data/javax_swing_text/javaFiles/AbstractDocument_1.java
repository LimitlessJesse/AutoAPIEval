import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.AbstractDocument;

public class AbstractDocument_1 {
    public static void main(String[] args) {
        AbstractDocument document = new AbstractDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                // Implementation of insertString method
                if (str != null && !str.isEmpty()) {
                    super.insertString(offs, str, a);
                }
            }
        };

        try {
            document.insertString(0, "Example", null);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
}
