import javax.swing.*;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;

public class MetalBorders_ButtonBorder_5 {
    public static void main(String[] args) {
        JButton button = new JButton("Button");
        button.setBorder(new MetalBorders.ButtonBorder());
        Insets insets = new Insets(0, 0, 0, 0);
        button.getBorder().getBorderInsets(button, insets);
        System.out.println("Top: " + insets.top + ", Left: " + insets.left + ", Bottom: " + insets.bottom + ", Right: " + insets.right);
    }
}
