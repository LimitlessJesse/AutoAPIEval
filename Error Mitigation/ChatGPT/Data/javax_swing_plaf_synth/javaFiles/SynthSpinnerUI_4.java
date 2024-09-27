import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class SynthSpinnerUI_4 {
    public static void main(String[] args) {
        SynthSpinnerUI ui = new SynthSpinnerUI();
        JComponent component = new JComponent() {};
        Graphics graphics = component.getGraphics();
        ui.paint(graphics, component);
    }
}
