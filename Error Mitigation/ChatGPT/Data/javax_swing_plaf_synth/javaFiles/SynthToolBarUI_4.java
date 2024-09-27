import javax.swing.plaf.synth.SynthToolBarUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class SynthToolBarUI_4 {
    public static void main(String[] args) {
        SynthToolBarUI ui = new SynthToolBarUI();
        JComponent component = new JComponent() {};
        Graphics graphics = component.getGraphics();
        
        ui.paint(graphics, component);
    }
}
