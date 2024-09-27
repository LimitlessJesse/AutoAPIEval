import javax.swing.plaf.metal.MetalComboBoxIcon;
import java.awt.Component;
import java.awt.Graphics;

public class MetalComboBoxIcon_1 {
    public static void main(String[] args) {
        MetalComboBoxIcon metalComboBoxIcon = new MetalComboBoxIcon();
        Component component = new Component() {};
        Graphics graphics = component.getGraphics();
        int x = 10;
        int y = 10;
        metalComboBoxIcon.paintIcon(component, graphics, x, y);
    }
}
