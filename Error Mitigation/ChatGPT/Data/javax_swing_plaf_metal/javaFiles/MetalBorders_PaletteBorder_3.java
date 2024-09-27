import javax.swing.plaf.metal.MetalBorders.PaletteBorder;
import java.awt.Component;
import java.awt.Graphics;

public class MetalBorders_PaletteBorder_3 {
    public static void main(String[] args) {
        PaletteBorder paletteBorder = new PaletteBorder();
        Component component = new Component() {};
        Graphics graphics = component.getGraphics();
        int x = 0;
        int y = 0;
        int width = 100;
        int height = 50;
        
        paletteBorder.paintBorder(component, graphics, x, y, width, height);
    }
}
