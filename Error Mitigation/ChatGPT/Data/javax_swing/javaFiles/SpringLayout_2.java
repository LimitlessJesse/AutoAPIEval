import javax.swing.SpringLayout;
import java.awt.Component;

public class SpringLayout_2 {
    public static void main(String[] args) {
        SpringLayout layout = new SpringLayout();
        Component component = new Component() {}; // Creating a dummy component for demonstration
        SpringLayout.Constraints constraints = layout.getConstraints(component);
        System.out.println("Constraints for component: " + constraints);
    }
}
