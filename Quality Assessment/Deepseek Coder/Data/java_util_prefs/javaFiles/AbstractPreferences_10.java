import java.util.prefs.AbstractPreferences;
import java.util.prefs.Preferences;

public class AbstractPreferences_10 {
    public static void main(String[] args) {
        AbstractPreferences prefs = Preferences.userRoot().node("/test");
        prefs.put("key1", "value1");
        System.out.println(prefs.get("key1", "default"));
    }
}
