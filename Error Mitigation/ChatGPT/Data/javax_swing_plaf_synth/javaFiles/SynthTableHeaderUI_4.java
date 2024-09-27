import javax.swing.plaf.synth.SynthTableHeaderUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class SynthTableHeaderUI_4 {
    public static void main(String[] args) {
        SynthTableHeaderUI ui = new SynthTableHeaderUI();
        JComponent component = new JComponent() {};
        Graphics graphics = component.getGraphics();
        
        ui.paint(graphics, component);
    }
}
