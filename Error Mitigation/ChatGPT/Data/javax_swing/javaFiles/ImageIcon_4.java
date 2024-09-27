import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Component;
import java.awt.Graphics;

public class ImageIcon_4 {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("path/to/image.jpg");
        
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        JLabel label = new JLabel() {
            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {
                super.paintIcon(c, g, x, y);
                icon.paintIcon(c, g, x, y);
            }
        };
        
        panel.add(label);
        frame.add(panel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
