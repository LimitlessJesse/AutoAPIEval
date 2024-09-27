import javax.swing.BoxLayout;
import java.awt.Container;
import java.awt.Dimension;

public class BoxLayout_5 {
    public static void main(String[] args) {
        BoxLayout boxLayout = new BoxLayout(new Container(), BoxLayout.X_AXIS);
        Dimension preferredSize = boxLayout.preferredLayoutSize(new Container());
        System.out.println("Preferred size: " + preferredSize);
    }
}
