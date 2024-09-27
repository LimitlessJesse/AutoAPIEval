import javax.swing.plaf.metal.MetalToolBarUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class MetalToolBarUI_5 {
    public static void main(String[] args) {
        MetalToolBarUI metalToolBarUI = new MetalToolBarUI();
        Graphics g = null; // Initialize Graphics object
        JComponent c = new JComponent(); // Initialize JComponent object
        metalToolBarUI.update(g, c);
    }
}
