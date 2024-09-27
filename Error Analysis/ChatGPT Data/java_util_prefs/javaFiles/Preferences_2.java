import java.util.prefs.Preferences;

public class Preferences_2 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("/com/example");
        String value = prefs.get("key", "default");
        System.out.println(value);
    }
}
