import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;

public class BasicScrollBarUI_4 {
    public static void main(String[] args) {
        BasicScrollBarUI ui = new BasicScrollBarUI() {
            @Override
            protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
                // Custom painting of the scrollbar thumb
                super.paintThumb(g, c, thumbBounds);
            }
        };
    }
}
