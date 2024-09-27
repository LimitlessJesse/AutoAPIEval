import javax.swing.ImageIcon;
import java.awt.Image;

public class ImageIcon_3 {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("path/to/image.jpg");
        Image image = icon.getImage();
        System.out.println("Image object: " + image);
    }
}
