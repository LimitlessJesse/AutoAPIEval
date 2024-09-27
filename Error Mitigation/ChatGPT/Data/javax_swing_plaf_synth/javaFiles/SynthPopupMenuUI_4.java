import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthPopupMenuUI;

public class SynthPopupMenuUI_4 {
    public static void main(String[] args) {
        SynthPopupMenuUI ui = new SynthPopupMenuUI();
        SynthContext context = new SynthContext(null, null, null, 0);
        ui.paintBorder(context, null, 0, 0, 100, 50);
    }
}
