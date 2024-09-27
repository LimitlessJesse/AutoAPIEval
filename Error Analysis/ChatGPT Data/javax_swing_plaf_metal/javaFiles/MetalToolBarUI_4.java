import javax.swing.JComponent;
import javax.swing.plaf.metal.MetalToolBarUI;

public class MetalToolBarUI_4 {
    public static void main(String[] args) {
        MetalToolBarUI metalUI = new MetalToolBarUI();
        JComponent component = new JComponent() {};
        metalUI.installUI(component);
    }
}
