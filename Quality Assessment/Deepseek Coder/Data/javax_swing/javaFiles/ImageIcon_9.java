import javax.swing.*;
import java.awt.*;

public class ImageIcon_9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("path_to_your_image.jpg");
        Image image = icon.getImage();

        frame.getContentPane().add(new JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                icon.paintIcon(this, g, 0, 0);
            }
        });

        frame.setVisible(true);
    }
}
