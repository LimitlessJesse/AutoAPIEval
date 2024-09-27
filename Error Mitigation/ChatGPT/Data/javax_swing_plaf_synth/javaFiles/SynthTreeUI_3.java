import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthTreeUI;

public class SynthTreeUI_3 {
    public static void main(String[] args) {
        SynthTreeUI ui = new SynthTreeUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        SynthContext context = ui.getContext(component);
        System.out.println(context.toString());
    }
}
