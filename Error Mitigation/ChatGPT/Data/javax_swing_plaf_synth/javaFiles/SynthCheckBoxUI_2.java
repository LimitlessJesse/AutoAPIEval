import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthCheckBoxUI;

public class SynthCheckBoxUI_2 {
    public static void main(String[] args) {
        SynthCheckBoxUI ui = new SynthCheckBoxUI();
        SynthContext context = new SynthContext(null, null, null, 0);
        ui.paintBorder(context, null, 0, 0, 100, 50);
    }
}
