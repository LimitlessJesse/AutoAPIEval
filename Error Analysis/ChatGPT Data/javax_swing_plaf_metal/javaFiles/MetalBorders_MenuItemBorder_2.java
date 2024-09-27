import javax.swing.plaf.metal.MetalBorders;
import java.awt.Component;
import java.awt.Graphics;

public class MetalBorders_MenuItemBorder_2 {
    public static void main(String[] args) {
        // Example usage of the paintBorder method
        Component component = new Component() {}; // Dummy component
        Graphics graphics = component.getGraphics();
        int x = 10;
        int y = 10;
        int width = 100;
        int height = 50;
        
        MetalBorders.MenuItemBorder menuItemBorder = new MetalBorders.MenuItemBorder();
        menuItemBorder.paintBorder(component, graphics, x, y, width, height);
    }
}
