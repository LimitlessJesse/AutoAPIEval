import javax.swing.JComponent;
import javax.swing.plaf.metal.MetalToolBarUI;

public class MetalToolBarUI_1 {
    public static void main(String[] args) {
        MetalToolBarUI metalToolBarUI = new MetalToolBarUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        metalToolBarUI.installUI(component);
    }
}
