import javax.swing.text.IconView;
import java.awt.Shape;
import javax.swing.text.Position;

public class IconView_5 {
    public static void main(String[] args) {
        IconView iconView = new IconView(null);
        float x = 10.0f;
        float y = 20.0f;
        Shape a = new Shape();
        Position.Bias[] bias = new Position.Bias[1];
        int location = iconView.viewToModel(x, y, a, bias);
        System.out.println("Location within the model: " + location);
    }
}
