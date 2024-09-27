import java.util.prefs.AbstractPreferences;
import java.util.prefs.Preferences;

public class AbstractPreferences_1 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("exampleNode");
        String[] children = new String[0];
        
        try {
            children = (String[]) prefs.childrenNames();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        for (String child : children) {
            System.out.println(child);
        }
    }
}
