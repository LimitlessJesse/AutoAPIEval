import javax.swing.plaf.basic.BasicBorders;
import javax.swing.*;
import java.awt.*;

public class BasicBorders_ButtonBorder_3 {
    public static void main(String[] args) {
        
    }
    
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        BasicBorders.ButtonBorder border = new BasicBorders.ButtonBorder(Color.BLACK, Color.WHITE, Color.RED, Color.GREEN);
        border.paintBorder(c, g, x, y, width, height);
    }
}
