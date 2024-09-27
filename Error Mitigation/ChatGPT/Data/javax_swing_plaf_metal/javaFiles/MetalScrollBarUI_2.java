import javax.swing.*;
import javax.swing.plaf.metal.MetalScrollBarUI;
import java.awt.*;

public class MetalScrollBarUI_2 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        MetalScrollBarUI ui = new MetalScrollBarUI() {
            @Override
            protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
                // Custom painting of the thumb
                g.setColor(Color.BLUE);
                g.fillRect(thumbBounds.x, thumbBounds.y, thumbBounds.width, thumbBounds.height);
            }
        };
        scrollBar.setUI(ui);
    }
}
