import javax.swing.text.BoxView;
import javax.swing.text.View;

public class BoxView_2 {
    public static void main(String[] args) {
        BoxView boxView = new BoxView(null, View.Y_AXIS);
        boxView.setAxis(View.X_AXIS);
    }
}
