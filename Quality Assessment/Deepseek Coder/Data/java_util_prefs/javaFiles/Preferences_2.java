import java.util.prefs.Preferences;

public class Preferences_2 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.systemRoot();
        System.out.println(prefs.absolutePath());
    }
}
