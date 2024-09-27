import javax.swing.JComponent;
import javax.swing.plaf.metal.MetalToolTipUI;
import java.awt.Dimension;

public class MetalToolTipUI_5 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        MetalToolTipUI metalToolTipUI = new MetalToolTipUI();
        Dimension preferredSize = metalToolTipUI.getPreferredSize(component);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
