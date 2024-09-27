import javax.swing.BoxLayout;
import java.awt.Component;

public class BoxLayout_4 {
    public static void main(String[] args) {
        BoxLayout layout = new BoxLayout(null, BoxLayout.X_AXIS);
        Component comp = new Component() {};
        layout.removeLayoutComponent(comp);
    }
}
