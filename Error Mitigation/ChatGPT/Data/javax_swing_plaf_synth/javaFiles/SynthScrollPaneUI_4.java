import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthScrollPaneUI;
import java.awt.Graphics;

public class SynthScrollPaneUI_4 {
    public static void main(String[] args) {
        SynthScrollPaneUI ui = new SynthScrollPaneUI();
        SynthContext context = new SynthContext(ui, null);
        Graphics g = null;
        int x = 0;
        int y = 0;
        int w = 100;
        int h = 50;
        
        ui.paintBorder(context, g, x, y, w, h);
    }
}
