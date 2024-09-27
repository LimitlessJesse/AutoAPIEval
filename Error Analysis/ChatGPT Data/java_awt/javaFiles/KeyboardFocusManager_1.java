import java.awt.KeyboardFocusManager;
import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

public class KeyboardFocusManager_1 {
    public static void main(String[] args) {
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        
        KeyEventDispatcher dispatcher = new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                System.out.println("Key event dispatched: " + e);
                return false;
            }
        };
        
        manager.addKeyEventDispatcher(dispatcher);
    }
}
