import javax.swing.text.IconView;
import javax.swing.text.Position;

public class IconView_5 {
    public static void main(String[] args) {
        IconView iconView = new IconView(null, null);
        float x = 10.5f;
        float y = 20.5f;
        Shape a = null;
        Position.Bias[] biasReturn = new Position.Bias[1];
        int result = iconView.viewToModel(x, y, a, biasReturn);
        System.out.println("Result: " + result);
    }
}
