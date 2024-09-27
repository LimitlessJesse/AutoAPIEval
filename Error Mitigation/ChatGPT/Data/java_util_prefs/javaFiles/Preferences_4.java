import java.util.prefs.Preferences;

public class Preferences_4 {
    public static void main(String[] args) {
        Preferences preferences = Preferences.userRoot().node("exampleNode");
        
        // Adding a key-value pair
        preferences.put("key1", "value1");
        
        // Removing the value associated with the specified key
        preferences.remove("key1");
        
        // Checking if the value is removed
        String value = preferences.get("key1", "default");
        System.out.println("Value for key1: " + value); // Output: Value for key1: default
    }
}
