import javax.swing.JScrollPane;
import javax.swing.plaf.synth.SynthScrollPaneUI;

public class SynthScrollPaneUI_5 {
    public static void main(String[] args) {
        // Create a JScrollPane
        JScrollPane scrollPane = new JScrollPane();

        // Call uninstallDefaults method
        SynthScrollPaneUI ui = new SynthScrollPaneUI();
        ui.uninstallDefaults(scrollPane);
    }
}
