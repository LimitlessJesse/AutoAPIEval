import java.util.prefs.Preferences;

public class Preferences_1 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot();
        prefs.put("username", "john");
        prefs.put("password", "secret");

        String username = prefs.get("username", "default");
        String password = prefs.get("password", "default");

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
