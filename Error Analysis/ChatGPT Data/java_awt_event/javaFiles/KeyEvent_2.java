import java.awt.event.KeyEvent;

public class KeyEvent_2 {
    public static void main(String[] args) {
        KeyEvent keyEvent = new KeyEvent(new Object(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_A, KeyEvent.CHAR_UNDEFINED);
        char keyChar = keyEvent.getKeyChar();
        System.out.println("Pressed key char: " + keyChar);
    }
}
