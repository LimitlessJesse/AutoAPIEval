import javax.swing.text.View;
import javax.swing.text.html.ParagraphView;

public class ParagraphView_3 {
    public static void main(String[] args) {
        ParagraphView paragraphView = new ParagraphView(null);
        View parent = new View(null);
        paragraphView.setParent(parent);
    }
}
