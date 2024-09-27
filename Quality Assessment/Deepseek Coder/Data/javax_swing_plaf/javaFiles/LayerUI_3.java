import javax.swing.*;
import javax.swing.plaf.LayerUI;
import java.awt.*;

public class LayerUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                paint(g, this);
            }

            @Override
            public void paint(Graphics g, JComponent c) {
                g.setColor(Color.RED);
                g.fillRect(10, 10, 100, 100);
            }
        };

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
