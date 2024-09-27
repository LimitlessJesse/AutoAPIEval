import javax.swing.plaf.synth.SynthToolTipUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class SynthToolTipUI_5 {
    public static void main(String[] args) {
        SynthToolTipUI ui = new SynthToolTipUI();
        JComponent component = new JComponent() {};
        Graphics graphics = component.getGraphics();
        
        ui.paint(graphics, component);
    }
}
