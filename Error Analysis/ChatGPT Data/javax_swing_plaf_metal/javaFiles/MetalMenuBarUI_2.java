import javax.swing.plaf.metal.MetalMenuBarUI;
import javax.swing.JComponent;

public class MetalMenuBarUI_2 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {};
        MetalMenuBarUI metalUI = new MetalMenuBarUI();
        metalUI.uninstallUI(component);
    }
}
