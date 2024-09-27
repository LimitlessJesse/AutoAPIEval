import java.awt.event.KeyEvent;

public class KeyEvent_1 {
    public static void main(String[] args) {
        // Create a KeyEvent object
        KeyEvent event = new KeyEvent(null, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_A, KeyEvent.CHAR_UNDEFINED);

        // Get the key code from the event
        int keyCode = event.getKeyCode();

        // Print the key code
        System.out.println("Key code: " + keyCode);
    }
}
