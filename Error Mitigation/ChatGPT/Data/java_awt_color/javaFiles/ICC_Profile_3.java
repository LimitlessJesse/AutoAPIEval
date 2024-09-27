import java.awt.color.ICC_Profile;

public class ICC_Profile_3 {
    public static void main(String[] args) {
        ICC_Profile profile = ICC_Profile.getInstance(someProfileData);
        int profileClass = profile.getProfileClass();
        System.out.println("Profile class: " + profileClass);
    }
}
