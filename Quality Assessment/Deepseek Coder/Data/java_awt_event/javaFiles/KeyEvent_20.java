import java.awt.event.KeyEvent;

public class KeyEvent_20 {
    public static void main(String[] args) {
        int modifiers = KeyEvent.CTRL_MASK | KeyEvent.SHIFT_MASK;
        KeyEvent event = KeyEvent.getKeyEvent(null, 0, 0, 0, false, false, false, false, '\0', modifiers);
        System.out.println("Modifiers: " + event.getModifiers());
    }
}
