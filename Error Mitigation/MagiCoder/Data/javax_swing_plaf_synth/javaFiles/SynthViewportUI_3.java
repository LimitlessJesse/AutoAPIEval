import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthViewportUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                SynthContext context = new SynthContext(g, this, null);
                SynthViewportUI ui = new SynthViewportUI();
                ui.paint(context, this);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
