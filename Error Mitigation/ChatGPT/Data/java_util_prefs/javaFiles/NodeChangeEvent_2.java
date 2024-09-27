import java.util.prefs.NodeChangeEvent;
import java.util.prefs.Preferences;

public class NodeChangeEvent_2 {
    public static void main(String[] args) {
        NodeChangeEvent event = new NodeChangeEvent(new Preferences() {
            @Override
            public Preferences parent() {
                return null;
            }
        });
        Preferences parent = event.getParent();
        System.out.println("Parent node: " + parent);
    }
}
