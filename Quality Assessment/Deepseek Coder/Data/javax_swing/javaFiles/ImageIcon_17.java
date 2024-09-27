import javax.swing.ImageIcon;
import java.awt.image.ImageObserver;

public class ImageIcon_17 {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("path_to_your_image");
        ImageObserver observer = icon.getImageObserver();
        // You can use the observer object here
    }
}
