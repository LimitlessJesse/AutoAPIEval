import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthScrollPaneUI;

public class SynthScrollPaneUI_3 {
    public static void main(String[] args) {
        SynthScrollPaneUI ui = new SynthScrollPaneUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        SynthContext context = ui.getContext(component);
        System.out.println(context.toString());
    }
}
