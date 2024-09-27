import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;

public class BasicScrollBarUI_2 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL);
        BasicScrollBarUI basicScrollBarUI = new BasicScrollBarUI() {
            @Override
            protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
                // Your implementation here
            }
        };
        scrollBar.setUI(basicScrollBarUI);
    }
}
