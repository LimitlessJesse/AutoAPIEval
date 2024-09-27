import javax.swing.text.View;
import javax.swing.text.html.ParagraphView;

public class ParagraphView_2 {
    public static void main(String[] args) {
        ParagraphView paragraphView = new ParagraphView(null);
        float preferredSpan = paragraphView.getPreferredSpan(View.X_AXIS);
        System.out.println("Preferred span for X_AXIS: " + preferredSpan);
    }
}
