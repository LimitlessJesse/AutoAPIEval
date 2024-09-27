import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.synth.SynthViewportUI;

public class SynthViewportUI_3 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {};
        SynthViewportUI synthViewportUI = new SynthViewportUI();
        ComponentUI ui = synthViewportUI.createUI(component);
        System.out.println(ui);
    }
}
