import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.Style;

public class DefaultStyledDocument_3 {
    public static void main(String[] args) {
        
    }

    public void removeStyle(DefaultStyledDocument doc, String nm) {
        Style style = doc.getStyle(nm);
        if (style != null) {
            doc.removeStyle(nm);
        }
    }
}
