import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import java.awt.Color;

public class DefaultHighlighter_DefaultHighlightPainter_1 {
    public static void main(String[] args) {
        DefaultHighlightPainter painter = new DefaultHighlightPainter(Color.RED);
        Color color = DefaultHighlightPainter.getColor(painter);
        System.out.println(color);
    }
}
