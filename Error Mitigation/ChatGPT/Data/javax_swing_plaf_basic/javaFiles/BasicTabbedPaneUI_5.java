import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class BasicTabbedPaneUI_5 {
    public static void main(String[] args) {
        BasicTabbedPaneUI tabbedPaneUI = new BasicTabbedPaneUI();
        Graphics graphics = null; // Initialize Graphics object
        JComponent component = new JComponent(); // Initialize JComponent object
        
        tabbedPaneUI.paint(graphics, component);
    }
}
