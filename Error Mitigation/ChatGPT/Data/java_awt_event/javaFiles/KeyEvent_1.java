import java.awt.event.KeyEvent;

public class KeyEvent_1 {
    public static void main(String[] args) {
        KeyEvent event = new KeyEvent(null, 0, 0, 0, 0, 'a');
        int keyCode = event.getKeyCode();
        System.out.println("Key code: " + keyCode);
    }
}
