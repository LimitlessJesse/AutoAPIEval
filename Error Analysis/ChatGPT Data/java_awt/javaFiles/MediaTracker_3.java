import java.awt.MediaTracker;
import java.awt.Image;
import java.awt.Toolkit;

public class MediaTracker_3 {
    public static void main(String[] args) {
        Image image1 = Toolkit.getDefaultToolkit().getImage("image1.jpg");
        Image image2 = Toolkit.getDefaultToolkit().getImage("image2.jpg");

        MediaTracker tracker = new MediaTracker(new java.awt.Component(){});
        tracker.addImage(image1, 0);
        tracker.addImage(image2, 1);

        try {
            tracker.waitForAll();
            System.out.println("All images loaded successfully.");
        } catch (InterruptedException e) {
            System.out.println("Error loading images: " + e.getMessage());
        }
    }
}
