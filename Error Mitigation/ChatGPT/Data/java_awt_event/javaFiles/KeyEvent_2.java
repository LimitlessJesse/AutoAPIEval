import java.awt.event.KeyEvent;

public class KeyEvent_2 {
    public static void main(String[] args) {
        KeyEvent keyEvent = new KeyEvent(null, 0, 0, 0, 0, 'A');
        char keyChar = keyEvent.getKeyChar();
        System.out.println("Key Character: " + keyChar);
    }
}
