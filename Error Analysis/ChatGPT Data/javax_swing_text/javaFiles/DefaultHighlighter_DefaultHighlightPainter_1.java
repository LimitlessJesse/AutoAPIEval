import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import java.awt.Color;

public class DefaultHighlighter_DefaultHighlightPainter_1 {
    public static void main(String[] args) {
        DefaultHighlightPainter highlighter = new DefaultHighlightPainter(Color.YELLOW);
        Color color = highlighter.getColor();
        System.out.println("Color: " + color);
    }
}
