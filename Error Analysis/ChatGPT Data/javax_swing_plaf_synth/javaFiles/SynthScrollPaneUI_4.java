import javax.swing.*;
import javax.swing.plaf.synth.SynthScrollPaneUI;

public class SynthScrollPaneUI_4 {
    public static void main(String[] args) {
        JScrollPane scrollpane = new JScrollPane();
        SynthScrollPaneUI ui = new SynthScrollPaneUI();
        ui.installDefaults(scrollpane);
        
        // Add any further customization or use of the JScrollPane here
    }
}
