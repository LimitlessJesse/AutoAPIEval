import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthTextPaneUI;

public class SynthTextPaneUI_1 {
    public static void main(String[] args) {
        SynthTextPaneUI ui = new SynthTextPaneUI();
        JComponent component = new JComponent() {};
        ui.installUI(component);
    }
}
