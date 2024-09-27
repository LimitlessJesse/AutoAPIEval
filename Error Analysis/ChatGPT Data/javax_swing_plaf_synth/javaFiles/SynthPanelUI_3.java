import javax.swing.plaf.synth.SynthPanelUI;
import javax.swing.*;

public class SynthPanelUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example Frame");
        JPanel panel = new JPanel();

        SynthPanelUI ui = new SynthPanelUI();
        ui.paint(panel.getGraphics(), panel);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
