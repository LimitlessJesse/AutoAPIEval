import java.awt.MediaTracker;
import java.awt.Image;

public class MediaTracker_4 {
    public static void main(String[] args) {
        MediaTracker tracker = new MediaTracker(new java.awt.Container());
        Image img1 = Toolkit.getDefaultToolkit().getImage("image1.jpg");
        Image img2 = Toolkit.getDefaultToolkit().getImage("image2.jpg");
        
        tracker.addImage(img1, 0);
        tracker.addImage(img2, 1);
        
        boolean allLoaded = tracker.checkAll();
        System.out.println("All images loaded: " + allLoaded);
    }
}
