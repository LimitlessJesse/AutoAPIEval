import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthToolTipUI;
import java.awt.Dimension;

public class SynthToolTipUI_4 {
    public static void main(String[] args) {
        SynthToolTipUI ui = new SynthToolTipUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        Dimension preferredSize = ui.getPreferredSize(component);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
