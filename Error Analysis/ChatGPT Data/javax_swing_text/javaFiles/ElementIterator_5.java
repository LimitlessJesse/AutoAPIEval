import javax.swing.text.Element;
import javax.swing.text.ElementIterator;
import javax.swing.text.BadLocationException;
import javax.swing.text.AbstractDocument;

public class ElementIterator_5 {
    public static void main(String[] args) {
        AbstractDocument doc = new javax.swing.text.PlainDocument();
        ElementIterator elementIterator = new ElementIterator(doc.getDefaultRootElement());
        
        Element firstElement = elementIterator.first();
        if (firstElement != null) {
            try {
                int startOffset = firstElement.getStartOffset();
                int endOffset = firstElement.getEndOffset();
                
                String text = doc.getText(startOffset, endOffset - startOffset);
                System.out.println("First element text: " + text);
            } catch (BadLocationException ex) {
                System.err.println("Error retrieving text from element");
            }
        } else {
            System.out.println("Document is empty");
        }
    }
}
