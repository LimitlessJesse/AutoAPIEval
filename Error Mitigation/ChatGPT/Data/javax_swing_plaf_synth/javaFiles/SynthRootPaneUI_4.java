import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthRootPaneUI;

import java.awt.Graphics;

public class SynthRootPaneUI_4 {
    public static void main(String[] args) {
        SynthContext context = new SynthContext(null, null, null, 0);
        Graphics g = null;
        int x = 0;
        int y = 0;
        int w = 100;
        int h = 50;

        SynthRootPaneUI ui = new SynthRootPaneUI();
        ui.paintBorder(context, g, x, y, w, h);
    }
}
