import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthOptionPaneUI_5 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                SynthOptionPaneUI ui = new SynthOptionPaneUI();
                ui.paint(g, this);
            }
        };
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(component);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
