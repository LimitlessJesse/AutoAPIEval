import java.awt.event.KeyEvent;

public class KeyEvent_22 {
    public static void main(String[] args) {
        char keyChar = 'A';
        KeyEvent event = new KeyEvent(null, 0, 0, 0, keyChar, 'A');
        KeyEvent.setKeyChar(event, keyChar);
        System.out.println("Key Char: " + event.getKeyChar());
    }
}
