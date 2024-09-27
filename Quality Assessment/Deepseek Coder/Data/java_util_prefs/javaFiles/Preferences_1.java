import java.util.prefs.Preferences;

public class Preferences_1 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userNodeForPackage(Preferences_1.class);
        prefs.put("newKey", "newValue");
        String newValue = prefs.get("newKey", "defaultValue");
        System.out.println(newValue);
    }
}
