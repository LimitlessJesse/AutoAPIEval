import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthMenuBarUI;

public class SynthMenuBarUI_5 {
    public static void main(String[] args) {
        SynthMenuBarUI ui = new SynthMenuBarUI();
        SynthContext context = new SynthContext(null, null, null, 0);
        ui.paintBorder(context, null, 0, 0, 100, 50);
    }
}
