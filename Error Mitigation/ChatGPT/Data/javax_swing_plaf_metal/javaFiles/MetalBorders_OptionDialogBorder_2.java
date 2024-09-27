import javax.swing.plaf.metal.MetalBorders;
import java.awt.Component;
import java.awt.Insets;

public class MetalBorders_OptionDialogBorder_2 {
    public static void main(String[] args) {
        MetalBorders.OptionDialogBorder border = new MetalBorders.OptionDialogBorder();
        Component component = new Component() {}; // Creating a dummy component for demonstration
        Insets insets = new Insets(0, 0, 0, 0); // Initial insets object
        
        Insets updatedInsets = border.getBorderInsets(component, insets);
        
        System.out.println("Updated Insets: " + updatedInsets);
    }
}
