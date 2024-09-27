import java.awt.color.ICC_ProfileRGB;

public class ICC_ProfileRGB_1 {
    public static void main(String[] args) {
        ICC_ProfileRGB profile = new ICC_ProfileRGB();
        float[] mediaWhitePoint = profile.getMediaWhitePoint();
        System.out.println("Media White Point: x=" + mediaWhitePoint[0] + ", y=" + mediaWhitePoint[1] + ", z=" + mediaWhitePoint[2]);
    }
}
