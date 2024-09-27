import javax.swing.JTextPane;
import javax.swing.text.StyledDocument;
import javax.swing.text.SimpleAttributeSet;

public class JTextPane_2 {
    public static void main(String[] args) {
        JTextPane textPane = new JTextPane();
        StyledDocument doc = textPane.getStyledDocument();
        
        // Set a new StyledDocument to the JTextPane
        textPane.setStyledDocument(doc);
    }
}
