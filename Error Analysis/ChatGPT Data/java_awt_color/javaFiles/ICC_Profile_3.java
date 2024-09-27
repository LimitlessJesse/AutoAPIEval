import java.awt.color.ICC_Profile;

public class ICC_Profile_3 {
    public static void main(String[] args) {
        ICC_Profile profile = ICC_Profile.getInstance(ICC_Profile.CS_sRGB);
        int minorVersion = profile.getMinorVersion();
        System.out.println("Minor Version: " + minorVersion);
    }
}
