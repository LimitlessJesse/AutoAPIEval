import java.awt.BorderLayout;
import java.awt.Component;

public class BorderLayout_2 {
    public static void main(String[] args) {
        BorderLayout layout = new BorderLayout();
        Component comp = new Component() {};
        Object constraints = BorderLayout.CENTER;
        layout.addLayoutComponent(comp, constraints); // This method adds the specified component to the layout using the specified constraints
    }
}
