import javax.swing.*;
import javax.swing.plaf.synth.SynthViewportUI;
import java.awt.*;

public class SynthViewportUI_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SynthViewportUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea(20, 50);
        JScrollPane scrollPane = new JScrollPane(textArea);

        scrollPane.setUI(new SynthViewportUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                super.paint(g, c);
                g.setColor(Color.RED);
                g.drawRect(50, 50, 100, 100);
            }
        });

        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }
}
