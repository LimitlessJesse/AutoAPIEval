import java.util.prefs.Preferences;

public class Preferences_4 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("com.example.myapp");
        prefs.clear();
        System.out.println("Preferences cleared successfully.");
    }
}
