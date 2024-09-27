import java.util.prefs.Preferences;

public class Preferences_1 {
    public static void main(String[] args) {
        Preferences preferences = Preferences.userNodeForPackage(Main.class);
        preferences.put("key1", "value1");
        String retrievedValue = preferences.get("key1", "default");
        System.out.println(retrievedValue);
    }
}
