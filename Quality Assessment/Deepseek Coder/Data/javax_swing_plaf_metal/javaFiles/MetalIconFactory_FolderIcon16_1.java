import javax.swing.*;
import javax.swing.plaf.metal.MetalIconFactory;
import java.awt.*;

public class MetalIconFactory_FolderIcon16_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Icon Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                MetalIconFactory.FolderIcon16.paintIcon(this, g, 0, 0);
            }
        };

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
