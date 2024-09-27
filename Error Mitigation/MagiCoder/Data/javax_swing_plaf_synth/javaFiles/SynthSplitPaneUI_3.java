import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthSplitPaneUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                SynthContext context = SynthUtils.getSynthContext(this);
                SynthSplitPaneUI ui = (SynthSplitPaneUI) context.getUI();
                ui.paint(context, g, this);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
