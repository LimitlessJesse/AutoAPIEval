import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthMenuItemUI;

public class SynthMenuItemUI_5 {
    public static void main(String[] args) {
        SynthMenuItemUI menuItemUI = new SynthMenuItemUI();
        SynthContext context = new SynthContext(null, null, null, null, 0);
        menuItemUI.paintBorder(context, null, 0, 0, 100, 50);
    }
}
