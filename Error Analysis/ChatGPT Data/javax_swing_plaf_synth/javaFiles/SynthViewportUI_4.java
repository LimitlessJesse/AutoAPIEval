import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthViewportUI;

public class SynthViewportUI_4 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {}; // Create a dummy JComponent for demonstration
        SynthViewportUI ui = new SynthViewportUI();
        SynthContext context = ui.getContext(component);
        System.out.println("SynthContext created for component: " + component.getName());
    }
}
