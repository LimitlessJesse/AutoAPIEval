import java.awt.BorderLayout;
import java.awt.Component;

public class BorderLayout_1 {
    public static void main(String[] args) {
        BorderLayout layout = new BorderLayout();
        Component component = new Component() {
        };
        Object constraints = BorderLayout.NORTH;
        layout.addLayoutComponent(component, constraints);
    }
}
