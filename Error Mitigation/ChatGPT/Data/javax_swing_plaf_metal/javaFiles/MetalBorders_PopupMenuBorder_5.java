import javax.swing.plaf.metal.MetalBorders.PopupMenuBorder;

import java.awt.Component;
import java.awt.Graphics;

public class MetalBorders_PopupMenuBorder_5 {
    public static void main(String[] args) {
        // Create a component for testing
        Component component = new Component() {};

        // Create an instance of PopupMenuBorder
        PopupMenuBorder popupMenuBorder = new PopupMenuBorder();

        // Call the paintBorder method
        popupMenuBorder.paintBorder(component, component.getGraphics(), 0, 0, 100, 50);
    }
}
