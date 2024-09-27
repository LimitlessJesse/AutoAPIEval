import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicLabelUI;
import javax.swing.plaf.synth.SynthLabelUI;
import java.awt.Dimension;

public class SynthLabelUI_5 {
    public static void main(String[] args) {
        SynthLabelUI ui = new SynthLabelUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        Dimension preferredSize = ui.getPreferredSize(component);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
