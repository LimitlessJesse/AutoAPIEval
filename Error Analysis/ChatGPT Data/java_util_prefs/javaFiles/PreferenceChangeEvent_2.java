import java.util.prefs.PreferenceChangeEvent;
import java.util.prefs.Preferences;

public class PreferenceChangeEvent_2 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userNodeForPackage(Main.class);
        
        prefs.put("key", "value");
        
        System.out.println("Current value: " + prefs.get("key", "default"));
        
        prefs.addNodeChangeListener(event -> {
            System.out.println("Node changed: " + event.getNode().name());
        });
        
        prefs.put("key", "new value");
    }
}
