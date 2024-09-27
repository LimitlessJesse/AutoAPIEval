import java.awt.color.ICC_ProfileGray;
import java.awt.color.ProfileDataException;

public class ICC_ProfileGray_1 {
    public static void main(String[] args) {
        ICC_ProfileGray profile = new ICC_ProfileGray();
        
        try {
            float gamma = profile.getGamma();
            System.out.println("Gamma value: " + gamma);
        } catch (ProfileDataException e) {
            System.out.println("Profile does not specify TRC as a single gamma value.");
        }
    }
}
