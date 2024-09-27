import javax.swing.JComponent;
import javax.swing.JViewport;
import javax.swing.plaf.synth.SynthViewportUI;

public class SynthViewportUI_5 {
    public static void main(String[] args) {
        JViewport viewport = new JViewport();
        SynthViewportUI synthViewportUI = new SynthViewportUI();
        synthViewportUI.installDefaults(viewport);
    }
}
