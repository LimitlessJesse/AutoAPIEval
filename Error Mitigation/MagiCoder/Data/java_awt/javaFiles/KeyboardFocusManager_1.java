import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyEventDispatcher;

public class KeyboardFocusManager_1 {
    public static void main(String[] args) {
        KeyboardFocusManager kfm = KeyboardFocusManager.getCurrentKeyboardFocusManager();

        kfm.addKeyEventDispatcher(new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                // Your custom logic here
                return false;
            }
        });
    }
}
