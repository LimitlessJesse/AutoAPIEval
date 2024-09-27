import java.awt.color.ICC_Profile;

public class ICC_Profile_2 {
    public static void main(String[] args) {
        ICC_Profile profile = ICC_Profile.getInstance(someProfileData);
        int minorVersion = profile.getMinorVersion();
        System.out.println("Minor version: " + minorVersion);
    }
}
