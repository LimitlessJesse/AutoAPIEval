import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.synth.SynthSeparatorUI;
import java.awt.Dimension;

public class SynthSeparatorUI_4 {
    public static void main(String[] args) {
        SynthSeparatorUI ui = new SynthSeparatorUI();
        JComponent component = new JComponent() {};
        Dimension preferredSize = ui.getPreferredSize(component);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
