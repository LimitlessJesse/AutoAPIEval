import javax.swing.plaf.metal.MetalBorders.MenuItemBorder;
import java.awt.Component;
import java.awt.Graphics;

public class MetalBorders_MenuItemBorder_5 {
    public static void main(String[] args) {
        MenuItemBorder menuItemBorder = new MenuItemBorder();
        Component component = new Component() {};
        Graphics graphics = component.getGraphics();
        int x = 0;
        int y = 0;
        int width = 100;
        int height = 50;
        
        menuItemBorder.paintBorder(component, graphics, x, y, width, height);
    }
}
