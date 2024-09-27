import java.awt.event.KeyEvent;

public class KeyEvent_5 {
    public static void main(String[] args) {
        KeyEvent keyEvent = new KeyEvent(null, KeyEvent.KEY_TYPED, System.currentTimeMillis(), 0, KeyEvent.VK_UNDEFINED, 'A');
        String paramString = keyEvent.paramString();
        System.out.println(paramString);
    }
}
