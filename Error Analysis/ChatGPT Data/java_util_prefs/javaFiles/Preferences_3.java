import java.util.prefs.Preferences;

public class Preferences_3 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("com.example");
        
        // Set a preference value
        prefs.put("key1", "value1");

        // Check if the preference exists and remove it
        if (prefs.get("key1", null) != null) {
            prefs.remove("key1");
            System.out.println("Preference with key 'key1' has been removed.");
        } else {
            System.out.println("Preference with key 'key1' does not exist.");
        }
    }
}
