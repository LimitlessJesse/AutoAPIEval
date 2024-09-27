import javax.swing.plaf.metal.MetalBorders;
import javax.swing.JButton;
import java.awt.Insets;

public class MetalBorders_PopupMenuBorder_3 {
    public static void main(String[] args) {
        MetalBorders.PopupMenuBorder border = new MetalBorders.PopupMenuBorder();
        JButton button = new JButton("Click me");
        Insets insets = new Insets(0, 0, 0, 0);
        
        border.getBorderInsets(button, insets);
        
        System.out.println("Top: " + insets.top);
        System.out.println("Left: " + insets.left);
        System.out.println("Bottom: " + insets.bottom);
        System.out.println("Right: " + insets.right);
    }
}
