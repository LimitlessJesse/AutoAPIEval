import java.util.prefs.Preferences;
import java.util.prefs.PreferenceChangeEvent;

public class PreferenceChangeEvent_2 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot();
        prefs.addPreferenceChangeListener(new PreferenceChangeListener() {
            public void preferenceChange(PreferenceChangeEvent evt) {
                Preferences node = evt.getNode();
                System.out.println("Preference node: " + node);
            }
        });
    }
}
