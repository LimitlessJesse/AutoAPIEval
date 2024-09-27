import javax.swing.plaf.synth.SynthComboBoxUI;
import javax.swing.*;

public class SynthComboBoxUI_2 {
    public static void main(String[] args) {
        JComboBox comboBox = new JComboBox();
        SynthComboBoxUI ui = new SynthComboBoxUI();
        
        ui.uninstallUI(comboBox);
    }
}
