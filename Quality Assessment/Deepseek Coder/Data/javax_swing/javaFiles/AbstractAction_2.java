import javax.swing.AbstractAction;
import javax.swing.Action;
import java.util.HashMap;
import java.util.Map;

public class AbstractAction_2 {
    public static void main(String[] args) {
        // Create an AbstractAction
        AbstractAction action = new AbstractAction("Test Action") {
            @Override
            public Object getValue(String key) {
                if ("enabled".equals(key)) {
                    return true;
                }
                return super.getValue(key);
            }
        };

        // Create a map to store values
        Map<String, Object> values = new HashMap<>();
        values.put("enabled", false);

        // Set values using the map
        action.putValue(Action.ENABLED, values.get("enabled"));

        // Get values using the getValue method
        boolean enabled = (boolean) action.getValue(Action.ENABLED);
        System.out.println("Action is enabled: " + enabled);
    }
}
