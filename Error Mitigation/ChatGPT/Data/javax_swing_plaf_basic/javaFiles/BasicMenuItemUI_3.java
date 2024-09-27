import javax.swing.plaf.basic.BasicMenuItemUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class BasicMenuItemUI_3 {
    public static void main(String[] args) {
        BasicMenuItemUI menuItemUI = new BasicMenuItemUI();
        Graphics graphics = null; // Initialize Graphics object
        JComponent component = new JComponent() {}; // Initialize JComponent object
        
        menuItemUI.paint(graphics, component);
    }
}
