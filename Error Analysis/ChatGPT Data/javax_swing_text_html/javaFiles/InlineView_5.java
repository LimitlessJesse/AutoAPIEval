import javax.swing.text.AttributeSet;
import javax.swing.text.Element;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.InlineView;

public class InlineView_5 {
    public static void main(String[] args) {
        HTMLDocument doc = new HTMLDocument();
        Element element = doc.getDefaultRootElement();
        
        AttributeSet attributes = ((InlineView) element).getAttributes();
        
        System.out.println("Attributes: " + attributes);
    }
}
