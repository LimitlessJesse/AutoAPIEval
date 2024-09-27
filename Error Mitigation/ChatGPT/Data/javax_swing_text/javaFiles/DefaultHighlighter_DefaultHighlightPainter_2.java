import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.text.JTextComponent;
import javax.swing.text.View;
import java.awt.Graphics;
import java.awt.Shape;

public class DefaultHighlighter_DefaultHighlightPainter_2 {
    public static void main(String[] args) {
        DefaultHighlightPainter highlightPainter = new DefaultHighlightPainter(java.awt.Color.YELLOW);
        JTextComponent textComponent = new JTextComponent() {
            @Override
            public void paint(Graphics g) {
                Shape bounds = getBounds();
                View view = getUI().getRootView(this);
                highlightPainter.paintLayer(g, 0, getText().length(), bounds, this, view);
            }
        };
    }
}
