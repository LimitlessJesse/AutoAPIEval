import java.util.prefs.AbstractPreferences;
import java.util.prefs.Preferences;

public class AbstractPreferences_3 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("myNode");
        prefs.putBoolean("myKey", true);
    }
}
