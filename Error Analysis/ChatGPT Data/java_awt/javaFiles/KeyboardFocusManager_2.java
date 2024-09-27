import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;

public class KeyboardFocusManager_2 {
    public static void main(String[] args) {
        // Create a custom KeyEventDispatcher
        KeyEventDispatcher dispatcher = new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(java.awt.event.KeyEvent e) {
                // Handle KeyEvent here
                return false; // Return true if KeyEvent is consumed
            }
        };

        // Add the custom KeyEventDispatcher to the KeyboardFocusManager
        KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(dispatcher);
    }
}
