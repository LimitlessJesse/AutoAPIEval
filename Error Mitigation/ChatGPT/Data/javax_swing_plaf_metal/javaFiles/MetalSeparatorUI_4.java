import javax.swing.JComponent;
import javax.swing.plaf.metal.MetalSeparatorUI;
import java.awt.Graphics;

public class MetalSeparatorUI_4 {
    public static void main(String[] args) {
        MetalSeparatorUI metalSeparatorUI = new MetalSeparatorUI();
        JComponent component = new JComponent() {
        };
        Graphics graphics = component.getGraphics();
        metalSeparatorUI.paint(graphics, component);
    }
}
