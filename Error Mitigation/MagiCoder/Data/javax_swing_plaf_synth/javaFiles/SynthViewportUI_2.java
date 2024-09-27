import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthViewportUI;

public class SynthViewportUI_2 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        SynthViewportUI synthViewportUI = new SynthViewportUI();
        synthViewportUI.uninstallUI(component);
    }
}
