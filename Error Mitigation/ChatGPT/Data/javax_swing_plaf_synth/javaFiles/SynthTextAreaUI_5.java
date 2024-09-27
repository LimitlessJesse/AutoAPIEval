import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.awt.Graphics;

public class SynthTextAreaUI_5 {
    public static void main(String[] args) {
        SynthContext context = new SynthContext();
        Graphics g = new Graphics();
        int x = 0;
        int y = 0;
        int w = 100;
        int h = 50;
        
        SynthTextAreaUI ui = new SynthTextAreaUI();
        ui.paintBorder(context, g, x, y, w, h);
    }
}
