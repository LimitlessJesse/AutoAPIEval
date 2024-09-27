import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthRootPaneUI;

public class SynthRootPaneUI_3 {
    public static void main(String[] args) {
        SynthRootPaneUI ui = new SynthRootPaneUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        SynthContext context = ui.getContext(component);
        System.out.println(context.toString());
    }
}
