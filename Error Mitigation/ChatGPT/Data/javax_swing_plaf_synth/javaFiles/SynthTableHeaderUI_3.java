import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthTableHeaderUI;
import javax.swing.JComponent;

public class SynthTableHeaderUI_3 {
    public static void main(String[] args) {
        SynthTableHeaderUI ui = new SynthTableHeaderUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        SynthContext context = ui.getContext(component);
        System.out.println(context.toString());
    }
}
