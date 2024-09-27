import java.awt.color.ICC_Profile;

public class ICC_Profile_5 {
    public static void main(String[] args) {
        ICC_Profile profile = ICC_Profile.getInstance(ICC_Profile.CLASS_A);
        int profileClass = profile.getProfileClass();
        System.out.println("Profile Class: " + profileClass);
    }
}
