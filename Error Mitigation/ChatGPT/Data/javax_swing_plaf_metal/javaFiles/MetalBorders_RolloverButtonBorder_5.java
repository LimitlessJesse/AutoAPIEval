import javax.swing.plaf.metal.MetalBorders;
import javax.swing.border.Border;
import java.awt.Component;
import java.awt.Graphics;

public class MetalBorders_RolloverButtonBorder_5 {
    public static void main(String[] args) {
        // Create a component for testing
        Component component = new Component() {};

        // Create an instance of MetalBorders.RolloverButtonBorder
        MetalBorders.RolloverButtonBorder border = new MetalBorders.RolloverButtonBorder();

        // Call the paintBorder method
        border.paintBorder(component, component.getGraphics(), 0, 0, 100, 50);
    }
}
