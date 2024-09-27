import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class DefaultStyledDocument_5 {
    public static void main(String[] args) {
        DefaultStyledDocument doc = new DefaultStyledDocument();
        SimpleAttributeSet attrs = new SimpleAttributeSet();

        StyleConstants.setForeground(attrs, java.awt.Color.red);
        StyleConstants.setBackground(attrs, java.awt.Color.black);
        StyleConstants.setBold(attrs, true);

        doc.setCharacterAttributes(0, doc.getLength(), attrs, true);

        try {
            doc.insertString(doc.getLength(), "Hello, World!\n", attrs);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(doc.getText(0, doc.getLength()));
    }
}
