import javax.swing.text.Position;
import javax.swing.text.CompositeView;
import java.awt.Shape;

public class CompositeView_5 {
    public static void main(String[] args) {
        CompositeView view = new CompositeView(null);
        int pos = 0;
        Position.Bias bias = Position.Bias.Forward;
        Shape a = null;
        int direction = 1;
        Position.Bias[] biasRet = new Position.Bias[1];
        int nextVisualPos = view.getNextVisualPositionFrom(pos, bias, a, direction, biasRet);
        System.out.println("Next visual position: " + nextVisualPos);
    }
}
