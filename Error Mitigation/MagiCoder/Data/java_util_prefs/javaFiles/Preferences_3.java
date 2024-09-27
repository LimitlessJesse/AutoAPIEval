import java.util.prefs.Preferences;

public class Preferences_3 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot();
        Preferences userPrefs = prefs.node("com/mycompany/myapp");
        userPrefs.put("background", "blue");
        userPrefs.put("foreground", "white");
        userPrefs.flush();
    }
}
