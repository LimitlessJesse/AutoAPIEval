import javax.swing.ImageIcon;
import java.awt.Image;

public class ImageIcon_13 {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("path_to_your_image.jpg");
        Image image = icon.getImage();
        icon = new ImageIcon(image);
    }
}
