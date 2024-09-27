import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthLabelUI;

public class SynthLabelUI_3 {
    public static void main(String[] args) {
        SynthLabelUI ui = new SynthLabelUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        SynthContext context = ui.getContext(component);
        System.out.println(context.toString());
    }
}
