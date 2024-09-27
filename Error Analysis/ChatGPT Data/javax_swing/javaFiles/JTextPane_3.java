import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class JTextPane_3 {
    public static void main(String[] args) {
        JTextPane textPane = new JTextPane();
        try {
            StyledDocument doc = textPane.getStyledDocument();
            SimpleAttributeSet attr = new SimpleAttributeSet();
            StyleConstants.setBold(attr, true);
            doc.insertString(doc.getLength(), "Hello, World!", attr);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
}
