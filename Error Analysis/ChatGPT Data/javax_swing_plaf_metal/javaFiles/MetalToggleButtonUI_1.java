import javax.swing.*;
import javax.swing.plaf.metal.MetalToggleButtonUI;

public class MetalToggleButtonUI_1 {
    public static void main(String[] args) {
        JToggleButton button = new JToggleButton();
        MetalToggleButtonUI ui = new MetalToggleButtonUI();
        ui.installDefaults(button);
    }
}
