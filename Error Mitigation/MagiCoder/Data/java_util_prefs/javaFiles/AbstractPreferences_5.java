import java.util.prefs.AbstractPreferences;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

public class AbstractPreferences_5 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("test");
        try {
            prefs.put("key", "value");
        } catch (BackingStoreException e) {
            e.printStackTrace();
        }
    }
}
