import java.util.prefs.Preferences;

public class Preferences_5 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("MyNode");
        prefs.put("key", "value");
        String value = prefs.get("key", "default");
        System.out.println(value);
    }
}
