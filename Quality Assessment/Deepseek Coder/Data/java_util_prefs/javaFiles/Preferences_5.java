import java.util.prefs.Preferences;

public class Preferences_5 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("/com/example/prefs");
        prefs.put("key1", "value1");
        prefs.put("key2", "value2");
    }
}
