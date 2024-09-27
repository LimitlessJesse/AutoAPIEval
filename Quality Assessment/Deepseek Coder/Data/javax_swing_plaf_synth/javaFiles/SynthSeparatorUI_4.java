import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthSeparatorUI_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SynthSeparatorUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(0, 1)) {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                SynthStyle style = SynthUtils.getStyle(this);
                SynthSeparatorUI ui = (SynthSeparatorUI) style.getComponentUI(this);
                ui.paint(g, this);
            }
        };

        panel.add(new JLabel("Label 1"));
        panel.add(new JSeparator());
        panel.add(new JLabel("Label 2"));

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
