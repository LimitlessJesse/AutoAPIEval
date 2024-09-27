import javax.swing.*;
import javax.swing.plaf.synth.SynthComboBoxUI;

public class SynthComboBoxUI_1 {
    public static void main(String[] args) {
        JComponent comboBox = new JComboBox();
        SynthComboBoxUI ui = new SynthComboBoxUI();
        ui.installUI(comboBox);
    }
}
