import javax.swing.JComponent;
import javax.swing.plaf.metal.MetalTreeUI;

public class MetalTreeUI_1 {
    public static void main(String[] args) {
        MetalTreeUI metalTreeUI = new MetalTreeUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        metalTreeUI.installUI(component);
    }
}
