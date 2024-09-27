import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Graphics;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class BasicScrollBarUI_3 {
    public static void main(String[] args) {
        
    }

    public void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
        BasicScrollBarUI ui = new BasicScrollBarUI();
        ui.paintTrack(g, c, trackBounds);
    }
}
