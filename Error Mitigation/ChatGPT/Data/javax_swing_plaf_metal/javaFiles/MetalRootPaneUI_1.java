import javax.swing.JComponent;
import javax.swing.plaf.metal.MetalRootPaneUI;

public class MetalRootPaneUI_1 {
    public static void main(String[] args) {
        MetalRootPaneUI metalUI = new MetalRootPaneUI();
        JComponent c = new JComponent() {}; // Creating a dummy JComponent for demonstration
        metalUI.installUI(c);
    }
}
