import javax.swing.text.View;
import javax.swing.text.html.ParagraphView;

public class ParagraphView_1 {
    public static void main(String[] args) {
        ParagraphView paragraphView = new ParagraphView(null);
        float minimumSpan = paragraphView.getMinimumSpan(View.X_AXIS);
        System.out.println("Minimum span along X_AXIS: " + minimumSpan);
    }
}
