import javax.swing.plaf.metal.MetalScrollBarUI;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Rectangle;

public class MetalScrollBarUI_4 {
    public static void main(String[] args) {
        
    }

    public void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
        MetalScrollBarUI ui = new MetalScrollBarUI();
        ui.paintThumb(g, c, thumbBounds);
    }
}
