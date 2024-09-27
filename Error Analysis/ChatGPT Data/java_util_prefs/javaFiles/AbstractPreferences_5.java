import java.util.prefs.AbstractPreferences;
import java.util.prefs.Preferences;

public class AbstractPreferences_5 {
    public static void main(String[] args) {
        AbstractPreferences preferences = (AbstractPreferences) Preferences.userRoot();
        byte[] byteArray = { 1, 2, 3, 4, 5 };
        preferences.putByteArray("key", byteArray);
    }
}
