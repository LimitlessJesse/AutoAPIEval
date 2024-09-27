import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.synth.SynthViewportUI;

public class SynthViewportUI_2 {
    public static void main(String[] args) {
        SynthViewportUI ui = new SynthViewportUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        ui.uninstallUI(component);
    }
}
