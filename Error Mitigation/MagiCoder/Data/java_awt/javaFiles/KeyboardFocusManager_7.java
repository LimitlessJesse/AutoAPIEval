import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyEventDispatcher;

public class KeyboardFocusManager_7 {
    public static void main(String[] args) {
        KeyboardFocusManager kfm = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        kfm.addKeyEventDispatcher(new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                System.out.println("Key event dispatched: " + e.getKeyCode());
                return false;
            }
        });

        // Remove the dispatcher
        kfm.removeKeyEventDispatcher(new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                System.out.println("Key event dispatched: " + e.getKeyCode());
                return false;
            }
        });
    }
}
