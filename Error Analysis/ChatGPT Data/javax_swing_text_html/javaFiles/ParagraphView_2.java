import javax.swing.text.html.ParagraphView;

public class ParagraphView_2 {
    public static void main(String[] args) {
        ParagraphView paragraphView = new ParagraphView(null);
        float minSpan = paragraphView.getMinimumSpan(ParagraphView.X_AXIS);
        System.out.println("Minimum span for X_AXIS: " + minSpan);
    }
}
