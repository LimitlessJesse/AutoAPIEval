import javax.swing.plaf.basic.BasicBorders;
import java.awt.Component;
import java.awt.Insets;

public class BasicBorders_FieldBorder_3 {
    public static void main(String[] args) {
        Component component = new Component() {}; // Creating a dummy component for demonstration
        Insets insets = new Insets(0, 0, 0, 0); // Creating an empty Insets object
        
        BasicBorders.FieldBorder border = new BasicBorders.FieldBorder(); // Creating an instance of BasicBorders.FieldBorder
        border.getBorderInsets(component, insets); // Using getBorderInsets method
        
        System.out.println("Top: " + insets.top);
        System.out.println("Left: " + insets.left);
        System.out.println("Bottom: " + insets.bottom);
        System.out.println("Right: " + insets.right);
    }
}
