import javax.swing.text.PlainDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class PlainDocument_1 {
    public static void main(String[] args) {
        PlainDocument doc = new PlainDocument();
        AttributeSet attr = new SimpleAttributeSet();
        StyleConstants.setForeground(attr, java.awt.Color.red);
        doc.insertString(0, "Hello, World", attr);
        System.out.println(doc);
    }
}
