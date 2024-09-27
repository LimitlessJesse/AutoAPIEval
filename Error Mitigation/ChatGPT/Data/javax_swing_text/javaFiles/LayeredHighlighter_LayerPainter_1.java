import javax.swing.text.JTextComponent;
import javax.swing.text.View;
import javax.swing.text.LayeredHighlighter.LayerPainter;

public class LayeredHighlighter_LayerPainter_1 {
    public static void main(String[] args) {
        LayerPainter layerPainter = new LayerPainter();
        JTextComponent c = new JTextComponent();
        View view = new View(c);
        layerPainter.paintLayer(null, 0, 1, null, c, view);
    }
}
