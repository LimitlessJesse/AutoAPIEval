import java.awt.event.KeyEvent;

public class KeyEvent_31 {
    public static void main(String[] args) {
        int keyCode = KeyEvent.VK_A; // For example, key code for 'A'
        char keyChar = KeyEvent.getKeyText(keyCode);
        System.out.println("Key character: " + keyChar);
    }
}
