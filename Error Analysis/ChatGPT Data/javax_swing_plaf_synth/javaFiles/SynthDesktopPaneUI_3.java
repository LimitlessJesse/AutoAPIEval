import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthDesktopPaneUI;
import java.awt.Graphics;

public class SynthDesktopPaneUI_3 {
    public static void main(String[] args) {
        
    }
    
    public void paintBorder(SynthContext context, Graphics g, int x, int y, int w, int h) {
        SynthDesktopPaneUI ui = new SynthDesktopPaneUI();
        ui.paintBorder(context, g, x, y, w, h);
    }
}
