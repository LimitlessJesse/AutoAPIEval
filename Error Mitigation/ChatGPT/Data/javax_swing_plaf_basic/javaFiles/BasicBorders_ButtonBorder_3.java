import javax.swing.plaf.basic.BasicBorders;
import javax.swing.border.Border;
import java.awt.Component;
import java.awt.Graphics;

public class BasicBorders_ButtonBorder_3 {
    public static void main(String[] args) {
        Border buttonBorder = new BasicBorders.ButtonBorder();
        Component component = new Component() {}; // Creating a dummy component for demonstration
        Graphics graphics = component.getGraphics(); // Getting graphics object from the component

        int x = 0;
        int y = 0;
        int width = 100;
        int height = 50;

        ((BasicBorders.ButtonBorder) buttonBorder).paintBorder(component, graphics, x, y, width, height);
    }
}
