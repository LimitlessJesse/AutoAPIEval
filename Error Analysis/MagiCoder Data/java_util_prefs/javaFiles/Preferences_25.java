import java.util.prefs.Preferences;

public class Preferences_25 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("MyPrefs");
        prefs.put("key", "value");
        prefs.flush();
    }
}
