import java.util.prefs.Preferences;
import java.util.prefs.BackingStoreException;

public class Preferences_3 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("com.example");
        
        try {
            String[] keys = prefs.keys();
            for (String key : keys) {
                System.out.println(key + ": " + prefs.get(key, null));
            }
        } catch (BackingStoreException e) {
            e.printStackTrace();
        }
    }
}
