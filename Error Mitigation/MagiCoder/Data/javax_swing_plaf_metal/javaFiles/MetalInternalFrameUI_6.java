import javax.swing.JComponent;
import javax.swing.plaf.metal.MetalInternalFrameUI;

public class MetalInternalFrameUI_6 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        MetalInternalFrameUI ui = new MetalInternalFrameUI();
        ui.installUI(component);
    }
}
