import javax.swing.ActionMap;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class ActionMap_1 {
    public static void main(String[] args) {
        ActionMap actionMap = new ActionMap();

        Action action = new AbstractAction() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Action performed");
            }
        };

        actionMap.put("key", action);

        // Trigger the action
        actionMap.get("key").actionPerformed(null);
    }
}
