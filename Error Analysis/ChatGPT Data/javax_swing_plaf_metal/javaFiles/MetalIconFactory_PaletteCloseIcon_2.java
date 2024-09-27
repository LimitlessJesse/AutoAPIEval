import javax.swing.*;
import javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon;

public class MetalIconFactory_PaletteCloseIcon_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Void paintIcon Example");
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                PaletteCloseIcon icon = new PaletteCloseIcon();
                icon.paintIcon(this, g, 10, 10);
            }
        };
        frame.add(panel);
    }
}
