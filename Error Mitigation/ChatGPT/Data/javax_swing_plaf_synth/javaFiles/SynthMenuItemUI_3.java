import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthMenuItemUI;

public class SynthMenuItemUI_3 {
    public static void main(String[] args) {
        SynthMenuItemUI ui = new SynthMenuItemUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        SynthContext context = ui.getContext(component);
        System.out.println(context.toString());
    }
}
