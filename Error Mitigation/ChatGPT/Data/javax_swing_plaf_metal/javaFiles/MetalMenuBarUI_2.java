import javax.swing.JComponent;
import javax.swing.plaf.metal.MetalMenuBarUI;

public class MetalMenuBarUI_2 {
    public static void main(String[] args) {
        MetalMenuBarUI metalUI = new MetalMenuBarUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        metalUI.uninstallUI(component);
    }
}
