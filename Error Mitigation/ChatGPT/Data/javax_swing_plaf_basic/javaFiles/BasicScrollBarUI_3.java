import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Rectangle;

public class BasicScrollBarUI_3 {
    public static void main(String[] args) {
        BasicScrollBarUI ui = new BasicScrollBarUI();
        JComponent component = new JComponent() {};
        Rectangle bounds = new Rectangle(0, 0, 100, 10);
        
        ui.paintThumb(null, component, bounds);
    }
}
