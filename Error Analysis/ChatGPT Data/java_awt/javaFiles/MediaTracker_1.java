import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

public class MediaTracker_1 {
    public static void main(String[] args) {
        MediaTracker tracker = new MediaTracker(new java.awt.Component() {});
        Image image = Toolkit.getDefaultToolkit().getImage("path_to_image.jpg");
        int id = 1;
        tracker.addImage(image, id);
        
        try {
            tracker.waitForID(id);
            System.out.println("Image loaded successfully");
        } catch (InterruptedException e) {
            System.out.println("Error loading image");
        }
    }
}
