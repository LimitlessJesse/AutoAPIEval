import javax.swing.*;
import javax.swing.plaf.metal.MetalScrollBarUI;
import java.awt.*;

public class MetalScrollBarUI_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL) {
            @Override
            public void paintThumb(Graphics g) {
                Rectangle thumbBounds = getThumbBounds();
                if (thumbBounds!= null) {
                    MetalScrollBarUI ui = (MetalScrollBarUI) getUI();
                    ui.paintThumb(g, this, thumbBounds);
                }
            }
        };

        frame.add(scrollBar);
        frame.pack();
        frame.setVisible(true);
    }
}
