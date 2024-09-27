import javax.swing.plaf.metal.MetalBorders.MenuBarBorder;
import java.awt.Component;
import java.awt.Graphics;

public class MetalBorders_MenuBarBorder_1 {
    public static void main(String[] args) {
        // Usage of the paintBorder method
        MenuBarBorder menuBarBorder = new MenuBarBorder();
        Component component = new Component() {};
        Graphics graphics = component.getGraphics();
        int x = 10;
        int y = 10;
        int width = 100;
        int height = 20;
        menuBarBorder.paintBorder(component, graphics, x, y, width, height);
    }
}
