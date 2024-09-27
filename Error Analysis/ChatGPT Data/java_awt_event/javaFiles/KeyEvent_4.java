import java.awt.event.KeyEvent;

public class KeyEvent_4 {
    public static void main(String[] args) {
        KeyEvent event = new KeyEvent(null, 0, 0, 0, 0, KeyEvent.CHAR_UNDEFINED);
        boolean isActionKey = event.isActionKey();
        System.out.println("Is action key: " + isActionKey);
    }
}
