import javax.swing.*;
import java.awt.*;

public class JLayeredPane_12 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLayeredPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JLayeredPane layeredPane = new JLayeredPane();
        frame.add(layeredPane);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.drawRect(50, 50, 100, 100);
            }
        };
        panel.setBounds(0, 0, 400, 400);
        layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);

        frame.setVisible(true);
    }
}
