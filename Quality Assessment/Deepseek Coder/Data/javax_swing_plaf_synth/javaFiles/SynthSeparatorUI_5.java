import javax.swing.*;
import javax.swing.plaf.synth.SynthSeparatorUI;
import java.awt.*;

public class SynthSeparatorUI_5 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                SynthSeparatorUI separatorUI = new SynthSeparatorUI();
                separatorUI.paint(g, this, 0, 0, getWidth(), getHeight());
            }
        };

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(component);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
