import javax.swing.JComponent;
import javax.swing.plaf.metal.MetalSeparatorUI;
import java.awt.Dimension;

public class MetalSeparatorUI_3 {
    public static void main(String[] args) {
        MetalSeparatorUI metalSeparatorUI = new MetalSeparatorUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        Dimension preferredSize = metalSeparatorUI.getPreferredSize(component);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
