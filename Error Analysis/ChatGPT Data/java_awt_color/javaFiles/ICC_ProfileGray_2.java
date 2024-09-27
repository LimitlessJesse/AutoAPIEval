import java.awt.color.ICC_ProfileGray;

public class ICC_ProfileGray_2 {
    public static void main(String[] args) {
        ICC_ProfileGray profile = new ICC_ProfileGray();
        float[] whitePoint = profile.getMediaWhitePoint();
        System.out.println("Media white point: " + whitePoint[0] + ", " + whitePoint[1] + ", " + whitePoint[2]);
    }
}
