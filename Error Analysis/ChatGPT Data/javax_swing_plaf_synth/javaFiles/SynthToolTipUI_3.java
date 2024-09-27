import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthToolTipUI;
import java.awt.Dimension;

public class SynthToolTipUI_3 {
    public static void main(String[] args) {
        SynthToolTipUI ui = new SynthToolTipUI();
        JComponent component = new JComponent() {
        };
        
        Dimension preferredSize = ui.getPreferredSize(component);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
