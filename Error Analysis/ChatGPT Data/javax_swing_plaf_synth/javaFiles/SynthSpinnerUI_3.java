import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class SynthSpinnerUI_3 {
    public static void main(String[] args) {
        SynthSpinnerUI ui = new SynthSpinnerUI();
        JComponent component = new JComponent() {};
        SynthContext context = ui.getContext(component);
        System.out.println(context.toString());
    }
}
