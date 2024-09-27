import java.beans.PropertyChangeListener;
import java.awt.KeyboardFocusManager;

public class KeyboardFocusManager_4 {
    public static void main(String[] args) {
        KeyboardFocusManager keyboardFocusManager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        
        PropertyChangeListener listener = evt -> {
            System.out.println("Property changed: " + evt.getPropertyName());
        };
        
        keyboardFocusManager.addPropertyChangeListener("focusedWindow", listener);
        
        // Simulating a property change event
        keyboardFocusManager.setGlobalFocusedWindow(new java.awt.Frame());
    }
}
