import java.awt.Image;
import java.awt.MediaTracker;

public class MediaTracker_2 {
    public static void main(String[] args) {
        // Create a MediaTracker instance
        MediaTracker mediaTracker = new MediaTracker(new java.awt.Component() {});

        // Load an image
        Image image = null; // Initialize with your image

        // Add the image to the MediaTracker
        mediaTracker.addImage(image, 0);

        // Remove the image from the MediaTracker
        mediaTracker.removeImage(image);

        // Check if the image is removed
        boolean isImageRemoved = mediaTracker.checkAll();

        System.out.println("Is image removed: " + isImageRemoved);
    }
}
