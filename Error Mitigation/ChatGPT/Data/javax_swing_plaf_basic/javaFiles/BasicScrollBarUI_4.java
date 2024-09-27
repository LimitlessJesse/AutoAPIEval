import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Rectangle;

public class BasicScrollBarUI_4 {
    public static void main(String[] args) {
        BasicScrollBarUI scrollBarUI = new BasicScrollBarUI();
        JComponent component = new JComponent() {};
        Rectangle trackBounds = new Rectangle(0, 0, 100, 20);
        
        scrollBarUI.paintTrack(null, component, trackBounds);
    }
}
