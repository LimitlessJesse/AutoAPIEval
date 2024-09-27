import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthTextFieldUI;
import java.awt.Graphics;

public class SynthTextFieldUI_5 {
    public static void main(String[] args) {
        SynthTextFieldUI ui = new SynthTextFieldUI();
        SynthContext context = new SynthContext(ui, null, null, SynthContext.ENABLED);
        Graphics g = null;
        int x = 0;
        int y = 0;
        int w = 100;
        int h = 50;
        
        ui.paintBorder(context, g, x, y, w, h);
    }
}
