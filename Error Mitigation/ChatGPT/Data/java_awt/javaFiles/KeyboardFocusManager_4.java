import java.awt.KeyboardFocusManager;

public class KeyboardFocusManager_4 {
    public static void main(String[] args) {
        KeyboardFocusManager keyboardFocusManager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        keyboardFocusManager.clearFocusOwner();
    }
}
