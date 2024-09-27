import javax.swing.text.AttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import javax.swing.text.DefaultStyledDocument;

public class DefaultStyledDocument_2 {
    public static void main(String[] args) {
        DefaultStyledDocument doc = new DefaultStyledDocument();
        Style parentStyle = StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE);
        Style newStyle = doc.addStyle("NewStyle", parentStyle);

        AttributeSet attributes = newStyle.getResolveParent();
        System.out.println("New Style Attributes: " + attributes);
    }
}

