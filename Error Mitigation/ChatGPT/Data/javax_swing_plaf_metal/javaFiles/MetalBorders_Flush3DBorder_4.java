import javax.swing.plaf.metal.MetalBorders;
import java.awt.Component;
import java.awt.Graphics;

public class MetalBorders_Flush3DBorder_4 {
    public static void main(String[] args) {
        MetalBorders.Flush3DBorder border = new MetalBorders.Flush3DBorder();
        Component component = new Component() {}; // Creating a dummy component for demonstration
        Graphics graphics = component.getGraphics(); // Getting graphics object from the component
        
        int x = 0;
        int y = 0;
        int width = 100;
        int height = 50;
        
        border.paintBorder(component, graphics, x, y, width, height);
    }
}
