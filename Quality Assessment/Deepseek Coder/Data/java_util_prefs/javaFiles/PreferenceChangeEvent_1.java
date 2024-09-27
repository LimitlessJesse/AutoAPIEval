import java.util.prefs.PreferenceChangeEvent;
import java.util.prefs.Preferences;

public class PreferenceChangeEvent_1 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("/test");
        prefs.put("key", "value");

        prefs.addPreferenceChangeListener(event -> {
            System.out.println("Key: " + event.getKey());
        });

        prefs.remove("key");
    }
}
