import java.util.prefs.Preferences;

public class Preferences_4 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("MyNode");
        prefs.put("key", "value");
    }
}
