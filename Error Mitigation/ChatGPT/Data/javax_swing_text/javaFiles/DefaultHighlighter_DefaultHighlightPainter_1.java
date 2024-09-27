import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import java.awt.Color;

public class DefaultHighlighter_DefaultHighlightPainter_1 {
    public static void main(String[] args) {
        DefaultHighlightPainter highlightPainter = new DefaultHighlightPainter(Color.YELLOW);
        Color color = highlightPainter.getColor();
        System.out.println("Color of the highlight: " + color);
    }
}
