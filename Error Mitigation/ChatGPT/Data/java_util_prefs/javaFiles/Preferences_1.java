import java.util.prefs.Preferences;

public class Preferences_1 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("com.example");
        String value = prefs.get("key1", "default");
        System.out.println("Value: " + value);
    }
}
