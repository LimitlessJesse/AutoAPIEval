import java.awt.color.ICC_ProfileGray;

public class ICC_ProfileGray_2 {
    public static void main(String[] args) {
        ICC_ProfileGray profile = new ICC_ProfileGray();
        float[] mediaWhitePoint = profile.getMediaWhitePoint();
        
        System.out.println("Media White Point:");
        for (float component : mediaWhitePoint) {
            System.out.println(component);
        }
    }
}
