import javax.swing.*;
import javax.swing.plaf.metal.MetalScrollBarUI;
import java.awt.*;

public class MetalScrollBarUI_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL) {
            MetalScrollBarUI metalUI = (MetalScrollBarUI) UIManager.getUI(this);

            @Override
            public void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
                metalUI.paintTrack(g, c, trackBounds);
                // Custom painting code here
                g.setColor(Color.RED);
                g.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
            }
        };

        frame.add(scrollBar);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
