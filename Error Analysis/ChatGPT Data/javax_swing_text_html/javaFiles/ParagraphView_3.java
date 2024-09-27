import javax.swing.text.Element;
import javax.swing.text.AttributeSet;
import javax.swing.text.ViewFactory;
import javax.swing.text.View;
import javax.swing.text.ViewFactory;
import javax.swing.text.Element;
import javax.swing.text.AttributeSet;
import javax.swing View;
import javax.swing.text.BoxView;
import javax.swing.text.html.InlineView;
import javax.swing.text.html.ParagraphView;

public class ParagraphView_3 {
    public static void main(String[] args) {
        ParagraphView paragraphView = new ParagraphView(null);
        float preferredSpan = paragraphView.getPreferredSpan(0);
        System.out.println("Preferred span on axis 0: " + preferredSpan);
    }
}
