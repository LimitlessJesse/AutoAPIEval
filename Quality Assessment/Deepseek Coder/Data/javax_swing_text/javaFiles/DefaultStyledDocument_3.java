import javax.swing.text.*;

public class DefaultStyledDocument_3 {
    public static void main(String[] args) {
        // Create a DefaultStyledDocument
        DefaultStyledDocument doc = new DefaultStyledDocument();

        // Add some text to the document
        try {
            doc.insertString(doc.getLength(), "Hello, World!\nThis is a test.", null);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }

        // Create an AttributeSet for the paragraph
        SimpleAttributeSet paraAttr = new SimpleAttributeSet();
        StyleConstants.setFontFamily(paraAttr, "Arial");
        StyleConstants.setForeground(paraAttr, Color.RED);

        // Set the paragraph attributes
        doc.setParagraphAttributes(0, doc.getLength(), paraAttr, true);

        // Print the document content
        System.out.println(doc.getText(0, doc.getLength()));
    }
}
