import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthViewportUI;

public class SynthViewportUI_3 {
    public static void main(String[] args) {
        SynthViewportUI ui = new SynthViewportUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        SynthContext context = ui.getContext(component);
        System.out.println(context.toString());
    }
}
