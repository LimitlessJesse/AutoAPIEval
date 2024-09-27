import java.awt.MediaTracker;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Frame;

public class MediaTracker_5 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        MediaTracker tracker = new MediaTracker(frame);
        
        Image image1 = Toolkit.getDefaultToolkit().getImage("image1.jpg");
        Image image2 = Toolkit.getDefaultToolkit().getImage("image2.jpg");
        
        tracker.addImage(image1, 0);
        tracker.addImage(image2, 1);
        
        try {
            tracker.waitForAll();
            System.out.println("All images have finished loading.");
        } catch (InterruptedException e) {
            System.out.println("Loading images interrupted.");
        }
    }
}
