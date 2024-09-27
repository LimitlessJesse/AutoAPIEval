import java.awt.event.KeyEvent;

public class KeyEvent_3 {
    public static void main(String[] args) {
        KeyEvent event = new KeyEvent(null, 0, 0, 0, 0, 'a');
        boolean isActionKey = event.isActionKey();
        System.out.println("Is Action Key: " + isActionKey);
    }
}
