import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class SynthSeparatorUI_2 {
    public static void main(String[] args) {
        SynthSeparatorUI ui = new SynthSeparatorUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        ui.uninstallUI(component);
    }
}
