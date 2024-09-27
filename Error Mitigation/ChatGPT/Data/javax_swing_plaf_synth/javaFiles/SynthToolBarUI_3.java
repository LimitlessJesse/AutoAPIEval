import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthToolBarUI;

public class SynthToolBarUI_3 {
    public static void main(String[] args) {
        SynthToolBarUI ui = new SynthToolBarUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        SynthContext context = ui.getContext(component);
        System.out.println(context.toString());
    }
}
