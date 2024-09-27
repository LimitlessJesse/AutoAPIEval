import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;

public class MetalScrollBarUI_2 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setUI(new MetalScrollBarUI());
        scrollBar.setPreferredSize(new Dimension(100, 100));
        scrollBar.setMaximum(100);
        scrollBar.setValue(50);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollBar);
        frame.pack();
        frame.setVisible(true);
    }

    private static class MetalScrollBarUI extends BasicScrollBarUI {
        @Override
        protected JButton createDecreaseButton(int orientation) {
            return new JButton();
        }

        @Override
        protected JButton createIncreaseButton(int orientation) {
            return new JButton();
        }

        @Override
        protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
            // Your implementation here
        }
    }
}
