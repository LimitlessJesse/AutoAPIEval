import javax.swing.*;
import java.awt.*;

public class MetalCheckBoxIcon_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                MetalCheckBoxIcon icon = new MetalCheckBoxIcon();
                icon.paintIcon(this, g, 0, 0);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
