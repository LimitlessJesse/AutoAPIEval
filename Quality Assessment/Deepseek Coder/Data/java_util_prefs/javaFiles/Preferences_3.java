import java.util.prefs.Preferences;

public class Preferences_3 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("com/my/prefs");
        prefs.put("username", "john");
        String username = prefs.get("username", "default");
        System.out.println(username);
    }
}
