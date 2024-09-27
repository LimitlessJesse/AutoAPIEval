import javax.swing.AbstractButton;
import javax.swing.plaf.metal.MetalToggleButtonUI;

public class MetalToggleButtonUI_3 {
    public static void main(String[] args) {
        // Implementing the uninstallDefaults method from MetalToggleButtonUI
        MetalToggleButtonUI metalUI = new MetalToggleButtonUI();
        AbstractButton button = new AbstractButton() {};
        metalUI.uninstallDefaults(button);
    }
}
