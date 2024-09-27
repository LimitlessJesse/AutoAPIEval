import javax.swing.SpringLayout;
import java.awt.Component;

public class SpringLayout_4 {
    public static void main(String[] args) {
        SpringLayout layout = new SpringLayout();
        Component component = new Component() {};

        layout.removeLayoutComponent(component);
    }
}
