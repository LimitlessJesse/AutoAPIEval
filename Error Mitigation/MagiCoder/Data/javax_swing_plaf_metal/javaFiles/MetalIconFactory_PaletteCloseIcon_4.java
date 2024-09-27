import javax.swing.*;
import java.awt.*;

public class MetalIconFactory_PaletteCloseIcon_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                MetalIconFactory.PaletteCloseIcon icon = new MetalIconFactory.PaletteCloseIcon();
                icon.paintIcon(this, g, 0, 0);
            }
        };

        frame.add(panel);
    }
}
