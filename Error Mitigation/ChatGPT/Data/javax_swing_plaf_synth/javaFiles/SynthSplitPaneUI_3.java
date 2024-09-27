import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthSplitPaneUI;

public class SynthSplitPaneUI_3 {
    public static void main(String[] args) {
        SynthSplitPaneUI ui = new SynthSplitPaneUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        SynthContext context = ui.getContext(component);
        System.out.println(context.toString());
    }
}
