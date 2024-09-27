import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthButtonUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Click me");
        SynthButtonUI synthButtonUI = new SynthButtonUI();
        BasicButtonUI basicButtonUI = new BasicButtonUI();
        basicButtonUI.install(button);

        button.addActionListener(e -> {
            Graphics g = button.getGraphics();
            synthButtonUI.paint(g, button);
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
