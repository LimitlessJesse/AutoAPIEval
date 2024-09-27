import javax.swing.text.Position;
import javax.swing.text.GlyphView;
import java.awt.Shape;

public class GlyphView_2 {
    public static void main(String[] args) {
        GlyphView glyphView = new GlyphView();
        int pos = 0;
        Position.Bias b = Position.Bias.Forward;
        Shape a = null;
        int direction = 1;
        Position.Bias[] biasRet = new Position.Bias[1];
        int nextPos = glyphView.getNextVisualPositionFrom(pos, b, a, direction, biasRet);
        System.out.println(nextPos);
    }
}
