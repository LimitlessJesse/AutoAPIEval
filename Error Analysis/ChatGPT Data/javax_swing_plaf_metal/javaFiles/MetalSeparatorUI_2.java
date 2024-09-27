import javax.swing.plaf.metal.MetalSeparatorUI;
import javax.swing.*;

public class MetalSeparatorUI_2 {
    public static void main(String[] args) {
        MetalSeparatorUI metalSeparatorUI = new MetalSeparatorUI();
        JComponent component = new JPanel();
        metalSeparatorUI.paint(component.getGraphics(), component);
    }
}
