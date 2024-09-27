import javax.swing.*;
import javax.swing.plaf.synth.SynthLabelUI;
import java.awt.*;

public class SynthLabelUI_3 {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("SynthLabelUI Example");

        // Create a custom JComponent
        JComponent customComponent = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                SynthLabelUI ui = new SynthLabelUI();
                ui.paint(g, this);
            }
        };

        frame.add(customComponent);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
