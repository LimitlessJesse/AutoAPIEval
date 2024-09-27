import javax.swing.*;
import javax.swing.plaf.metal.MetalScrollBarUI;
import java.awt.*;

public class MetalScrollBarUI_1 {
    public static void main(String[] args) {
        // Create a dummy JScrollBar to use MetalScrollBarUI
        JScrollBar scrollBar = new JScrollBar();
        MetalScrollBarUI metalScrollBarUI = new MetalScrollBarUI() {
            @Override
            protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
                // Custom painting of the track
                super.paintTrack(g, c, trackBounds);
            }
        };
        scrollBar.setUI(metalScrollBarUI);
    }
}
