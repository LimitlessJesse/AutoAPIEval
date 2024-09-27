import javax.swing.border.AbstractBorder;
import java.awt.Component;
import java.awt.Insets;

public class AbstractBorder_1 {
    public static void main(String[] args) {
        AbstractBorder border = new AbstractBorder() {
            @Override
            public Insets getBorderInsets(Component c) {
                return new Insets(0, 0, 0, 0);
            }
        };
        
        Component component = new Component() {}; // Creating a dummy component for demonstration
        Insets insets = border.getBorderInsets(component);
        
        System.out.println("Top: " + insets.top);
        System.out.println("Left: " + insets.left);
        System.out.println("Bottom: " + insets.bottom);
        System.out.println("Right: " + insets.right);
    }
}
