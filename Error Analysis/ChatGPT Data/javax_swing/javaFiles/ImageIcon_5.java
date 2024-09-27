import javax.swing.ImageIcon;
import java.awt.ImageObserver;

public class ImageIcon_5 {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("image.jpg");
        ImageObserver observer = icon.getImageObserver();
        
        // Use the ImageObserver for further operations
    }
}
