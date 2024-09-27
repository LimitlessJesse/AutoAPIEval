import javax.swing.plaf.metal.MetalBorders;

import java.awt.Component;
import java.awt.Graphics;

public class MetalBorders_RolloverButtonBorder_2 {
    public static void main(String[] args) {
        Component component = new Component() {}; // Create a dummy Component for demonstration
        Graphics graphics = component.getGraphics();
        int x = 0;
        int y = 0;
        int width = 100;
        int height = 50;
        
        MetalBorders.RolloverButtonBorder border = new MetalBorders.RolloverButtonBorder();
        border.paintBorder(component, graphics, x, y, width, height);
    }
}
