import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class SynthSeparatorUI_3 {
    public static void main(String[] args) {
        SynthSeparatorUI ui = new SynthSeparatorUI();
        JComponent component = new JComponent() {};
        Graphics graphics = component.getGraphics();
        
        ui.paint(graphics, component);
    }
}
