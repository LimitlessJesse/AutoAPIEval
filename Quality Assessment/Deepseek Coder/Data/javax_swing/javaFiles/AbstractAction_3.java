import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.event.ActionEvent;

public class AbstractAction_3 {
    public static void main(String[] args) {
        AbstractAction action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Action performed");
            }
        };

        action.putValue(Action.NAME, "MyAction");
        action.putValue(Action.SHORT_DESCRIPTION, "This is my action");

        System.out.println(action.getValue(Action.NAME));
        System.out.println(action.getValue(Action.SHORT_DESCRIPTION));
    }
}
