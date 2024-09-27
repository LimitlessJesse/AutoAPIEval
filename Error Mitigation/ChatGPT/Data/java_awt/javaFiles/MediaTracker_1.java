import java.awt.Image;
import java.awt.MediaTracker;

public class MediaTracker_1 {
    public static void main(String[] args) {
        MediaTracker tracker = new MediaTracker(new java.awt.Component(){});
        Image image = new javax.swing.ImageIcon("image.jpg").getImage();
        int id = 1;
        tracker.addImage(image, id);
    }
}
