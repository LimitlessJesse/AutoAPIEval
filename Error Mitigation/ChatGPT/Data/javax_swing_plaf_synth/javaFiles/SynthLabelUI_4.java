import javax.swing.plaf.synth.SynthLabelUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class SynthLabelUI_4 {
    public static void main(String[] args) {
        SynthLabelUI ui = new SynthLabelUI();
        JComponent component = new JComponent() {};
        Graphics graphics = component.getGraphics();
        ui.paint(graphics, component);
    }
}
