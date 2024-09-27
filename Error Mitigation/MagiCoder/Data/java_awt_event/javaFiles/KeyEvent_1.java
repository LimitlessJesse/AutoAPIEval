import java.awt.event.KeyEvent;

public class KeyEvent_1 {
    public static void main(String[] args) {
        KeyEvent event = new KeyEvent(null, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_A, 'A');
        int keyCode = event.getKeyCode();
        System.out.println("Key Code: " + keyCode);
    }
}
