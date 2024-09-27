import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthLabelUI_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JLabel label = new JLabel("Hello, World!");
        SynthContext context = new SynthContext();
        SynthLabelUI labelUI = new SynthLabelUI();
        labelUI.paint(context, label.getGraphics(), 0, 0, label.getWidth(), label.getHeight());

        frame.getContentPane().add(label);
        frame.setVisible(true);
    }
}
