import javax.swing.*;
import javax.swing.plaf.metal.MetalScrollBarUI;

public class MetalScrollBarUI_3 {
    public static void main(String[] args) {
        MetalScrollBarUI metalScrollBarUI = new MetalScrollBarUI() {
            @Override
            protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
                // Your custom implementation of painting the track
            }
        };
    }
}
