import javax.swing.*;
import javax.swing.plaf.metal.MetalIconFactory;
import java.awt.*;

public class MetalIconFactory_PaletteCloseIcon_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                MetalIconFactory.PaletteCloseIcon closeIcon = new MetalIconFactory.PaletteCloseIcon();
                closeIcon.paintIcon(this, g, 10, 10);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
