import javax.swing.*;
import javax.swing.plaf.LayerUI;
import java.awt.*;

public class LayerUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawString("Hello, World!", 10, 20);
            }
        };

        LayerUI<JPanel> layerUI = new LayerUI<JPanel>() {
            @Override
            public void paint(Graphics g, JComponent c) {
                super.paint(g, c);
                panel.paintComponent(g);
            }
        };

        panel.setLayerUI(layerUI);

        frame.add(panel);
        frame.setVisible(true);
    }
}
