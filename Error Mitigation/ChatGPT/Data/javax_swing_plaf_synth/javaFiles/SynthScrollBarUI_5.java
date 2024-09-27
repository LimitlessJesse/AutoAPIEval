import javax.swing.plaf.synth.SynthScrollBarUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class SynthScrollBarUI_5 {
    public static void main(String[] args) {
        SynthScrollBarUI ui = new SynthScrollBarUI();
        JComponent component = new JComponent() {};
        Graphics graphics = component.getGraphics();
        
        ui.paint(graphics, component);
    }
}
