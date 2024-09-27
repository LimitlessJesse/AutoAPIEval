import javax.swing.AbstractAction;
import javax.swing.Action;

public class AbstractAction_5 {
    public static void main(String[] args) {
        Action action = new AbstractAction("Test") {
            @Override
            public boolean isEnabled() {
                return true;
            }
        };

        System.out.println(action.isEnabled());
    }
}
