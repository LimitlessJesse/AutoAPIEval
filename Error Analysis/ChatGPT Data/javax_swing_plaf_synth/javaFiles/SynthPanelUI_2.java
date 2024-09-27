import javax.swing.*;
import javax.swing.plaf.synth.SynthPanelUI;

public class SynthPanelUI_2 {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        SynthPanelUI ui = new SynthPanelUI();
        ui.installUI(panel);
    }
}
