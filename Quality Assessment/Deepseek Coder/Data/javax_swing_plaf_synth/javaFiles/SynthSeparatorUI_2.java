import javax.swing.*;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class SynthSeparatorUI_2 {
    public static void main(String[] args) {
        JComponent component = new JButton("Test");
        SynthSeparatorUI ui = new SynthSeparatorUI();
        ui.installUI(component);
        //... do some operations with the component...
        ui.uninstallUI(component);
    }
}
