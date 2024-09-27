import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyEventDispatcher;

public class KeyboardFocusManager_3 {
    public static void main(String[] args) {
        // Create a KeyEventDispatcher
        KeyEventDispatcher dispatcher = new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                // Handle the KeyEvent
                System.out.println("Key event: " + e.getKeyCode());
                return false;
            }
        };

        // Add the KeyEventDispatcher to the KeyboardFocusManager
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(dispatcher);

        // Remove the KeyEventDispatcher from the KeyboardFocusManager
        KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(dispatcher);
    }
}
