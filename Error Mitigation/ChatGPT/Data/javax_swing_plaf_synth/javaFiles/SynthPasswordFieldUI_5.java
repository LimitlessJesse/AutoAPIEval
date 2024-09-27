import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class SynthPasswordFieldUI_5 {
    public static void main(String[] args) {
        SynthPasswordFieldUI ui = new SynthPasswordFieldUI();
        SynthContext context = new SynthContext(ui, null, null, 0);
        ui.paintBorder(context, null, 0, 0, 100, 50);
    }
}
