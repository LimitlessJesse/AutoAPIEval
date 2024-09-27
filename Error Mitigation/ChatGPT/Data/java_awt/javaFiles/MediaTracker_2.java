import java.awt.Image;
import java.awt.MediaTracker;

public class MediaTracker_2 {
    public static void main(String[] args) {
        MediaTracker tracker = new MediaTracker(new java.awt.Component(){});
        Image image = null; // Initialize your image here
        tracker.removeImage(image);
    }
}
