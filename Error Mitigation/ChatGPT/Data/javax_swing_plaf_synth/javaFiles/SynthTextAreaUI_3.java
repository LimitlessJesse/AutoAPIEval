import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthTextAreaUI;

public class SynthTextAreaUI_3 {
    public static void main(String[] args) {
        SynthTextAreaUI ui = new SynthTextAreaUI();
        JComponent component = new JComponent() {}; // Creating a dummy component for demonstration
        SynthContext context = ui.getContext(component);
        System.out.println(context.toString());
    }
}
