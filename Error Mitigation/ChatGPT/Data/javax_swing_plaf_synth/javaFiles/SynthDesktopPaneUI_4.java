import javax.swing.plaf.synth.SynthDesktopPaneUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class SynthDesktopPaneUI_4 {
    public static void main(String[] args) {
        SynthDesktopPaneUI ui = new SynthDesktopPaneUI();
        JComponent component = new JComponent() {};
        Graphics graphics = component.getGraphics();
        
        ui.paint(graphics, component);
    }
}
