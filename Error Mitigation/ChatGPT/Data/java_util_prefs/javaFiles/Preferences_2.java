import java.util.prefs.Preferences;

public class Preferences_2 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("com.example");
        prefs.put("key1", "value1");
        String value = prefs.get("key1", "default");
        System.out.println("Retrieved value: " + value);
    }
}
