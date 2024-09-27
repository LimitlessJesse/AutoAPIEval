import javax.swing.plaf.metal.MetalBorders;
import java.awt.Component;
import java.awt.Insets;

public class MetalBorders_Flush3DBorder_3 {
    public static void main(String[] args) {
        MetalBorders.Flush3DBorder border = new MetalBorders.Flush3DBorder();
        Component component = new Component() {}; // Create a sample component
        Insets insets = new Insets(0, 0, 0, 0); // Create an empty Insets object
        
        Insets result = border.getBorderInsets(component, insets);
        
        System.out.println("Top: " + result.top);
        System.out.println("Left: " + result.left);
        System.out.println("Bottom: " + result.bottom);
        System.out.println("Right: " + result.right);
    }
}
