import java.util.prefs.NodeChangeEvent;
import java.util.prefs.Preferences;

public class NodeChangeEvent_3 {
    public static void main(String[] args) {
        NodeChangeEvent nodeChangeEvent = new NodeChangeEvent(Preferences.userRoot(), Preferences.userRoot().parent());
        Preferences parentPreferences = nodeChangeEvent.getParent();
        System.out.println("Parent Preferences: " + parentPreferences);
    }
}
