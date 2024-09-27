import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthInternalFrameUI;
import java.awt.Graphics;

public class SynthInternalFrameUI_4 {
    public static void main(String[] args) {
        SynthInternalFrameUI ui = new SynthInternalFrameUI();
        SynthContext context = new SynthContext(ui, null, null, SynthContext.DEFAULT);
        Graphics g = null;
        int x = 0;
        int y = 0;
        int w = 100;
        int h = 50;
        
        ui.paintBorder(context, g, x, y, w, h);
    }
}
