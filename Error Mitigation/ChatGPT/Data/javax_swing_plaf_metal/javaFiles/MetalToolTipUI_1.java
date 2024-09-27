import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicToolTipUI;
import javax.swing.plaf.metal.MetalToolTipUI;

public class MetalToolTipUI_1 {
    public static void main(String[] args) {
        MetalToolTipUI metalToolTipUI = new MetalToolTipUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        metalToolTipUI.installUI(component);
    }
}
