import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthViewportUI;
import java.awt.Graphics;

public class SynthViewportUI_4 {
    public static void main(String[] args) {
        SynthViewportUI ui = new SynthViewportUI();
        SynthContext context = new SynthContext(ui, null, null, 0);
        Graphics g = null;
        int x = 0;
        int y = 0;
        int w = 100;
        int h = 50;
        
        ui.paintBorder(context, g, x, y, w, h);
    }
}
