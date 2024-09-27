import javax.swing.plaf.metal.MetalBorders;
import javax.swing.border.Border;
import java.awt.Component;
import java.awt.Graphics;

public class MetalBorders_TableHeaderBorder_2 {
    public static void main(String[] args) {
        MetalBorders.TableHeaderBorder tableHeaderBorder = new MetalBorders.TableHeaderBorder();
        Component component = new Component() {};
        Graphics graphics = component.getGraphics();
        int x = 0;
        int y = 0;
        int width = 100;
        int height = 50;
        
        tableHeaderBorder.paintBorder(component, graphics, x, y, width, height);
    }
}
