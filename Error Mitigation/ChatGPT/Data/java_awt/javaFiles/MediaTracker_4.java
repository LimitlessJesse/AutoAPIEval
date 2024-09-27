import java.awt.MediaTracker;
import java.awt.Image;

public class MediaTracker_4 {
    public static void main(String[] args) {
        MediaTracker tracker = new MediaTracker(new java.awt.Component() {});
        Image image = null; // Initialize your image here
        int id = 1; // Specify the identifier for the image
        
        tracker.addImage(image, id);
        
        try {
            tracker.waitForID(id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        boolean allLoaded = tracker.checkID(id);
        System.out.println("All images loaded: " + allLoaded);
    }
}
