import javax.swing.text.FieldView;
import javax.swing.text.Position;

public class FieldView_5 {
    public static void main(String[] args) {
        FieldView fieldView = new FieldView(null);
        float x = 10.0f;
        float y = 20.0f;
        Shape shape = null;
        Position.Bias[] bias = new Position.Bias[1];
        int location = fieldView.viewToModel(x, y, shape, bias);
        System.out.println("Location within the model: " + location);
    }
}
