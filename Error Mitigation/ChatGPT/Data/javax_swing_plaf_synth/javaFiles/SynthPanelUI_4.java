import javax.swing.*;
import javax.swing.plaf.synth.SynthPanelUI;
import java.awt.*;

public class SynthPanelUI_4 {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        SynthPanelUI ui = new SynthPanelUI();
        Graphics graphics = panel.getGraphics();
        ui.paint(graphics, panel);
    }
}
