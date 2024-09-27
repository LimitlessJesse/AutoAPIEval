import java.util.prefs.Preferences;

public class Preferences_5 {
    public static void main(String[] args) {
        Preferences preferences = Preferences.userRoot().node("com.example.myapp");
        
        String[] keys = preferences.keys();
        
        for (String key : keys) {
            System.out.println(key + ": " + preferences.get(key, null));
        }
    }
}
