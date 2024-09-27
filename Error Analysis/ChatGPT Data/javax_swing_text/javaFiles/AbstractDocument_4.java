import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.Element;
import javax.swing.text.AbstractDocument;

import javax.swing.text.PlainDocument;
import javax.swing.text.StyledDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

public class AbstractDocument_4 {
    public static void main(String[] args) {
        StyledDocument doc = new PlainDocument(); // Use a StyledDocument for attribute support
        try {
            doc.insertString(0, "Hello", null); // Inserting "Hello" at the beginning
            AttributeSet attr = new SimpleAttributeSet();
            StyleConstants.setBold(attr, true); // Applying bold style
            doc.insertString(doc.getLength(), "\nWorld", attr); // Inserting "World" at the end with bold style
            System.out.println(doc.getText(0, doc.getLength())); // Output the contents of the document
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
}
