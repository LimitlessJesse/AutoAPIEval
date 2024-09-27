import javax.swing.plaf.metal.MetalBorders.InternalFrameBorder;
import java.awt.Component;
import java.awt.Graphics;

public class MetalBorders_InternalFrameBorder_2 {
    public static void main(String[] args) {
        InternalFrameBorder border = new InternalFrameBorder();
        Component component = new Component() {};
        Graphics graphics = component.getGraphics();
        int x = 0;
        int y = 0;
        int width = 100;
        int height = 50;
        
        border.paintBorder(component, graphics, x, y, width, height);
    }
}
