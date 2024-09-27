import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Image_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Graphics getGraphics() Example");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image image = new ImageIcon("example.jpg").getImage();
                g.drawImage(image, 0, 0, null);
            }
        };
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
