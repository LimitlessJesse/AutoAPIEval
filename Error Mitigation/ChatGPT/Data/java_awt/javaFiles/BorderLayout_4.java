import java.awt.BorderLayout;
import java.awt.Component;

public class BorderLayout_4 {
    public static void main(String[] args) {
        BorderLayout layout = new BorderLayout();
        Component component = new Component() {};
        Object constraints = layout.getConstraints(component);
        System.out.println("Constraints for component: " + constraints);
    }
}
