import javax.swing.ActionMap;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.util.HashMap;

public class ActionMap_2 {
    public static void main(String[] args) {
        ActionMap actionMap = new ActionMap();

        Action action1 = new AbstractAction("Action 1") {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Action 1 performed");
            }
        };

        Action action2 = new AbstractAction("Action 2") {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Action 2 performed");
            }
        };

        actionMap.put("key1", action1);
        actionMap.put("key2", action2);

        Action action = actionMap.get("key1");
        action.actionPerformed(null);

        action = actionMap.get("key2");
        action.actionPerformed(null);
    }
}
