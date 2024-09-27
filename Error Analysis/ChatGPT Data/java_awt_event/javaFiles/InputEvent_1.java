import java.awt.event.InputEvent;

public class InputEvent_1 {
    public static void main(String[] args) {
        int modifiers = InputEvent.ALT_DOWN_MASK | InputEvent.CTRL_DOWN_MASK;
        System.out.println("Modifiers: " + modifiers);
    }
}
