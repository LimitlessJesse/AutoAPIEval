import java.awt.Container;
import java.awt.DefaultKeyboardFocusManager;

public class DefaultKeyboardFocusManager_2 {
    public static void main(String[] args) {
        DefaultKeyboardFocusManager focusManager = new DefaultKeyboardFocusManager();
        Container container = new Container(); // Create a sample Container
        focusManager.downFocusCycle(container);
    }
}
