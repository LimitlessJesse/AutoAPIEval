import javax.swing.plaf.metal.MetalBorders;
import javax.swing.*;

public class MetalBorders_PopupMenuBorder_2 {
    public static void main(String[] args) {
        Component component = new JButton("Button");
        Graphics graphics = component.getGraphics();
        int x = 0;
        int y = 0;
        int width = 100;
        int height = 50;
        
        MetalBorders.PopupMenuBorder.paintBorder(component, graphics, x, y, width, height);
    }
}
