import javax.swing.plaf.basic.BasicBorders;
import javax.swing.border.Border;
import java.awt.Component;
import java.awt.Graphics;

public class BasicBorders_ToggleButtonBorder_4 {
    public static void main(String[] args) {
        
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Border border = new BasicBorders.ToggleButtonBorder();
        border.paintBorder(c, g, x, y, width, height);
    }
}
