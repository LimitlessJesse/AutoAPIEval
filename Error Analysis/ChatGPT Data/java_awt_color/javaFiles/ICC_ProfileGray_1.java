import java.awt.color.ICC_ProfileGray;

public class ICC_ProfileGray_1 {
    public static void main(String[] args) {
        ICC_ProfileGray profile = new ICC_ProfileGray();
        float gamma = profile.getGamma();
        System.out.println("Gamma: " + gamma);
    }
}
