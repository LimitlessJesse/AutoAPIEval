import java.awt.*;

public class MediaTracker_5 {
    public static void main(String[] args) {
        MediaTracker mediaTracker = new MediaTracker(new Component(){});
        int id = 0;
        boolean result = mediaTracker.checkID(id);
        System.out.println("Check result for ID " + id + ": " + result);
    }
}
