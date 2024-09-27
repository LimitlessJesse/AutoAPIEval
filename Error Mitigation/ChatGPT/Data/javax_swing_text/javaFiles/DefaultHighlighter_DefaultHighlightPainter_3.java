import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.text.JTextComponent;
import java.awt.Graphics;
import java.awt.Shape;

public class DefaultHighlighter_DefaultHighlightPainter_3 {
    public static void main(String[] args) {
        DefaultHighlightPainter highlightPainter = new DefaultHighlightPainter(java.awt.Color.YELLOW);
        JTextComponent textComponent = new JTextComponent() {
            @Override
            public void paint(Graphics g, int offs0, int offs1, Shape bounds, JTextComponent c) {
                highlightPainter.paint(g, offs0, offs1, bounds, c);
            }
        };
    }
}
