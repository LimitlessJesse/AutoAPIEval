import java.util.prefs.PreferenceChangeEvent;

public class PreferenceChangeEvent_1 {
    public static void main(String[] args) {
        PreferenceChangeEvent event = new PreferenceChangeEvent(null, "keyName", "value");
        String key = event.getKey();
        System.out.println("Key: " + key);
    }
}
