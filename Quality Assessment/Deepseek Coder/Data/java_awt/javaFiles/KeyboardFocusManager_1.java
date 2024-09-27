import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyEventDispatcher;

public class KeyboardFocusManager_1 {
    public static void main(String[] args) {
        // Create a KeyEventDispatcher
        KeyEventDispatcher dispatcher = new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                // Handle key events
                if (e.getID() == KeyEvent.KEY_PRESSED) {
                    System.out.println("Key pressed: " + e.getKeyCode());
                }
                return false;
            }
        };

        // Add the KeyEventDispatcher to the KeyboardFocusManager
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(dispatcher);
    }
}
