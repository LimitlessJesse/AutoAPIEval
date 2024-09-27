import java.util.prefs.AbstractPreferences;
import java.util.prefs.Preferences;

public class AbstractPreferences_4 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("test");
        prefs.put("key", "value");
        String value = prefs.get("key", "default");
        System.out.println(value); // Outputs: value
    }
}
