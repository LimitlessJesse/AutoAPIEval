import java.util.prefs.Preferences;

public class Preferences_5 {
    public static void main(String[] args) {
        Preferences preferences = Preferences.userRoot().node("com/example/app");
        preferences.put("key1", "value1");
        preferences.put("key2", "value2");
        
        String value1 = preferences.get("key1", "default1");
        String value2 = preferences.get("key2", "default2");
        
        System.out.println("Value for key1: " + value1);
        System.out.println("Value for key2: " + value2);
    }
}
