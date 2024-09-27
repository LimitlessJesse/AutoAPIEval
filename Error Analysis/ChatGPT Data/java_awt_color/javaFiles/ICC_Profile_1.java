import java.awt.color.ICC_Profile;

public class ICC_Profile_1 {
    public static void main(String[] args) {
        ICC_Profile profile = ICC_Profile.getInstance(someProfileData);
        byte[] data = profile.getData();
        System.out.println("ICC Profile data: " + data);
    }
}
