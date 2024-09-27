import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthTabbedPaneUI;

public class SynthTabbedPaneUI_3 {
    public static void main(String[] args) {
        SynthTabbedPaneUI ui = new SynthTabbedPaneUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        SynthContext context = ui.getContext(component);
        System.out.println(context.toString());
    }
}
