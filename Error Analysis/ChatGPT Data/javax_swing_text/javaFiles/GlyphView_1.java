import javax.swing.text.GlyphView;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class GlyphView_1 {
    public static void main(String[] args) {
        GlyphView glyphView = new GlyphView(null);
        Shape shape = new Rectangle2D.Float(0, 0, 100, 100);
        int pos = 0;
        Position.Bias bias = Position.Bias.Forward;
        
        Shape view = glyphView.modelToView(pos, shape, bias);
        System.out.println("View shape: " + view);
    }
}
