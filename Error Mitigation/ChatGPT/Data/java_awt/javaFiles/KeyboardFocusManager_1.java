import java.awt.KeyboardFocusManager;
import java.awt.AWTPermission;

public class KeyboardFocusManager_1 {
    public static void main(String[] args) {
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        
        try {
            manager.clearGlobalFocusOwner();
            System.out.println("Global focus owner cleared successfully.");
        } catch (SecurityException e) {
            System.out.println("SecurityException: " + e.getMessage());
        }
    }
}
