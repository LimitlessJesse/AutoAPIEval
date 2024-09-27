import javax.swing.text.ComponentView;
import javax.swing.text.Position;

public class ComponentView_5 {
    public static void main(String[] args) {
        ComponentView componentView = new ComponentView(null);
        float x = 10.0f;
        float y = 20.0f;
        Shape a = null;
        Position.Bias[] bias = new Position.Bias[1];
        int location = componentView.viewToModel(x, y, a, bias);
        System.out.println("Location within the model: " + location);
    }
}
