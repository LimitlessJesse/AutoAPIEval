import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;

public class AbstractBorder_1 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        AbstractBorder border = button.getBorder();
        Insets insets = border.getBorderInsets(button);
        System.out.println("Top: " + insets.top);
        System.out.println("Left: " + insets.left);
        System.out.println("Bottom: " + insets.bottom);
        System.out.println("Right: " + insets.right);
    }
}
