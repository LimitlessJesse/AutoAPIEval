import java.awt.event.KeyEvent;

public class KeyEvent_21 {
    public static void main(String[] args) {
        KeyEvent event = new KeyEvent(null, 0, 0, 0, KeyEvent.VK_A, 'A');
        System.out.println("Key Code: " + event.getKeyCode());
        System.out.println("Key Char: " + event.getKeyChar());
    }
}
