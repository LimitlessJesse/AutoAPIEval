import javax.swing.plaf.metal.MetalBorders;
import java.awt.Component;
import java.awt.Graphics;

public class MetalBorders_ScrollPaneBorder_4 {
    public static void main(String[] args) {
        MetalBorders.ScrollPaneBorder scrollPaneBorder = new MetalBorders.ScrollPaneBorder();
        Component component = new Component() {};
        Graphics graphics = component.getGraphics();
        int x = 0;
        int y = 0;
        int width = 100;
        int height = 50;
        scrollPaneBorder.paintBorder(component, graphics, x, y, width, height);
    }
}
