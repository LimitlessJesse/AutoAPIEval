import javax.swing.OverlayLayout;
import java.awt.Component;

public class OverlayLayout_1 {
    public static void main(String[] args) {
        OverlayLayout overlayLayout = new OverlayLayout(null);
        Component component = new Component() {};
        Object constraints = new Object();
        overlayLayout.addLayoutComponent(component, constraints);
    }
}
