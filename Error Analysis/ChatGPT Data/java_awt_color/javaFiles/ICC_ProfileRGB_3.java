import java.awt.color.ICC_ProfileRGB;

public class ICC_ProfileRGB_3 {
    public static void main(String[] args) {
        ICC_ProfileRGB profileRGB = new ICC_ProfileRGB();
        float gamma = profileRGB.getGamma(0);
        System.out.println("Gamma value for channel 0: " + gamma);
    }
}
