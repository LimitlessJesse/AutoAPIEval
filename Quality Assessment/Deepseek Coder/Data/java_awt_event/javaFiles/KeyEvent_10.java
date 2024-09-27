import java.awt.event.KeyEvent;

public class KeyEvent_10 {
    public static void main(String[] args) {
        int keyCode = KeyEvent.VK_A;
        boolean isActionKey = KeyEvent.isActionKey(keyCode);
        System.out.println("Is key code " + keyCode + " an action key? " + isActionKey);
    }
}
