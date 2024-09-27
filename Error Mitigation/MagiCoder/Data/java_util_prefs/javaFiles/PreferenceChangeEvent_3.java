import java.util.prefs.PreferenceChangeEvent;
import java.util.prefs.Preferences;

public class PreferenceChangeEvent_3 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("MyNode");
        prefs.addPreferenceChangeListener(e -> {
            System.out.println("Preference changed: " + e.getKey());
        });
        prefs.put("key1", "value1");
        prefs.put("key2", "value2");
    }
}
