import java.awt.event.KeyEvent;

public class KeyEvent_2 {
    public static void main(String[] args) {
        KeyEvent event = new KeyEvent(null, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_A, 'A');
        int keyLocation = event.getKeyLocation();
        System.out.println("Key Location: " + keyLocation);
    }
}
