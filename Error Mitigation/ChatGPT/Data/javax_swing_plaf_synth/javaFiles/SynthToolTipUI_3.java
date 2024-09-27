import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthToolTipUI;

public class SynthToolTipUI_3 {
    public static void main(String[] args) {
        SynthToolTipUI ui = new SynthToolTipUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        SynthContext context = ui.getContext(component);
        System.out.println(context.toString());
    }
}
