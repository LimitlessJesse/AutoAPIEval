import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;

public class ActionEvent_1 {
    public static void main(String[] args) {
        ActionEvent event = new ActionEvent(new Object(), 0, "");
        int modifiers = event.getModifiers();
        System.out.println("Modifiers: " + modifiers);

        if ((modifiers & InputEvent.SHIFT_MASK)!= 0) {
            System.out.println("Shift key is pressed");
        }

        if ((modifiers & InputEvent.CTRL_MASK)!= 0) {
            System.out.println("Control key is pressed");
        }

        if ((modifiers & InputEvent.ALT_MASK)!= 0) {
            System.out.println("Alt key is pressed");
        }

        if ((modifiers & InputEvent.META_MASK)!= 0) {
            System.out.println("Meta key is pressed");
        }
    }
}
