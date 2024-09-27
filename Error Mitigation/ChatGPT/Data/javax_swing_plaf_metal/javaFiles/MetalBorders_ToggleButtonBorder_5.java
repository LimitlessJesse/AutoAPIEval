import javax.swing.plaf.metal.MetalBorders;
import javax.swing.border.Border;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Graphics;

public class MetalBorders_ToggleButtonBorder_5 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        Border border = new MetalBorders.ToggleButtonBorder();
        border.paintBorder(button, button.getGraphics(), 0, 0, button.getWidth(), button.getHeight());
    }
}
