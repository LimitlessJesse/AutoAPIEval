import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.synth.SynthSeparatorUI;
import java.awt.Dimension;

public class SynthSeparatorUI_5 {
    public static void main(String[] args) {
        SynthSeparatorUI ui = new SynthSeparatorUI();
        JComponent component = new JComponent() {};
        Dimension minimumSize = ui.getMinimumSize(component);
        System.out.println("Minimum size: " + minimumSize);
    }
}
