import javax.swing.Action;
import javax.swing.ActionMap;

public class ActionMap_2 {
    public static void main(String[] args) {
        ActionMap actionMap = new ActionMap();
        Action action = actionMap.get("key");
    }
}
