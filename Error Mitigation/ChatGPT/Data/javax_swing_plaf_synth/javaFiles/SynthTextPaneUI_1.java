import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicEditorPaneUI;
import javax.swing.plaf.synth.SynthTextPaneUI;

public class SynthTextPaneUI_1 {
    public static void main(String[] args) {
        SynthTextPaneUI ui = new SynthTextPaneUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        ui.installUI(component);
    }
}
