import javax.swing.text.BoxView;
import javax.swing.text.View;
import java.awt.*;

public class BoxView_4 {
    public static void main(String[] args) {
        BoxView boxView = new BoxView(null, 0);
        Shape a = new Rectangle(0, 0, 100, 100);
        Shape childAllocation = boxView.getChildAllocation(0, a);
        System.out.println(childAllocation);
    }
}
