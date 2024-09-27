import java.awt.Component;
import java.awt.KeyboardFocusManager;

public class KeyboardFocusManager_3 {
    public static void main(String[] args) {
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        Component focusOwner = new Component() {}; // create a dummy Component for demonstration
        try {
            manager.setGlobalFocusOwner(focusOwner);
            System.out.println("Focus owner set successfully");
        } catch (SecurityException e) {
            System.out.println("SecurityException: " + e.getMessage());
        }
    }
}
