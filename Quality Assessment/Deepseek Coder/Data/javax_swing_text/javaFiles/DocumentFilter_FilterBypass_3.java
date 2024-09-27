import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

public class DocumentFilter_FilterBypass_3 {
    public static void main(String[] args) {
        Document doc = new PlainDocument();
        DocumentFilter.FilterBypass bypass = new DocumentFilter.FilterBypass() {
            @Override
            public void remove(int offset, int length) throws BadLocationException {
                // Your code here
            }

            @Override
            public void insertString(int offset, String string, AttributeSet attr) throws BadLocationException {
                // Your code here
            }

            @Override
            public Document getDocument() {
                return doc;
            }
        };

        try {
            bypass.insertString(0, "Hello, World", null);
            bypass.remove(0, 5);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
}
