import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthButtonUI;

public class SynthButtonUI_5 {
    public static void main(String[] args) {
        SynthButtonUI ui = new SynthButtonUI();
        SynthContext context = new SynthContext(ui, null, null, SynthContext.ENABLED);
        ui.paintBorder(context, null, 0, 0, 100, 50);
    }
}
