import java.awt.color.ICC_Profile;

public class ICC_Profile_5 {
    public static void main(String[] args) {
        ICC_Profile profile = ICC_Profile.getInstance(someProfileData);
        byte[] data = profile.getData(ICC_Profile.icSigHead);
        if(data != null) {
            System.out.println("Header data: " + new String(data));
        } else {
            System.out.println("Specified tag doesn't exist.");
        }
    }
}
