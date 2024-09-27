import javax.swing.plaf.basic.BasicBorders;
import javax.swing.border.Border;
import java.awt.Component;
import java.awt.Graphics;

public class BasicBorders_FieldBorder_4 {
    public static void main(String[] args) {
        // Create a component
        Component component = new Component() {};

        // Create an instance of FieldBorder
        Border border = new BasicBorders.FieldBorder();

        // Call the paintBorder method
        border.paintBorder(component, component.getGraphics(), 0, 0, 100, 50);
    }
}
