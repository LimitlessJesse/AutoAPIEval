import javax.swing.plaf.metal.MetalBorders.InternalFrameBorder;
import java.awt.Component;
import java.awt.Insets;

public class MetalBorders_InternalFrameBorder_3 {
    public static void main(String[] args) {
        InternalFrameBorder internalFrameBorder = new InternalFrameBorder();
        Component component = new Component() {}; // Creating a dummy component for demonstration
        Insets insets = new Insets(0, 0, 0, 0); // Initial insets object
        
        Insets updatedInsets = internalFrameBorder.getBorderInsets(component, insets);
        
        System.out.println("Updated Insets: " + updatedInsets);
    }
}
