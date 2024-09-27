import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrame_10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setVisible(true);

        ImageIcon icon = new ImageIcon("path_to_your_image.png");
        frame.setIconImage(icon.getImage());
    }
}
