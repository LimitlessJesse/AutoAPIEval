import javax.swing.JComponent;
import javax.swing.plaf.metal.MetalMenuBarUI;

public class MetalMenuBarUI_1 {
    public static void main(String[] args) {
        MetalMenuBarUI metalUI = new MetalMenuBarUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        metalUI.installUI(component);
    }
}
