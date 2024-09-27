import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class BasicButtonUI_3 {
    public static void main(String[] args) {
        BasicButtonUI basicButtonUI = new BasicButtonUI();
        Graphics graphics = null; // Initialize Graphics object
        JComponent component = new JComponent() {}; // Create a JComponent object
        
        basicButtonUI.paint(graphics, component);
    }
}
