import javax.swing.text.DefaultHighlighter;
import java.awt.Color;

public class DefaultHighlighter_DefaultHighlightPainter_3 {
    public static void main(String[] args) {
        DefaultHighlighter.DefaultHighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.RED);
        Color color = painter.getColor();
        System.out.println("The color of the highlight is: " + color);
    }
}
