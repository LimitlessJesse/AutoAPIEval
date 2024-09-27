import java.util.prefs.Preferences;

public class Preferences_4 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("/com/zetcode");
        prefs.put("key1", "value1");

        String value = prefs.get("key1", "default");
        System.out.println(value);
    }
}
