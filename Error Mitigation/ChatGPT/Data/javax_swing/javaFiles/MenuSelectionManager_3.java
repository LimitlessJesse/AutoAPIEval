import javax.swing.MenuSelectionManager;
import java.awt.event.KeyEvent;

public class MenuSelectionManager_3 {
    public static void main(String[] args) {
        MenuSelectionManager menuSelectionManager = new MenuSelectionManager();
        KeyEvent keyEvent = new KeyEvent(null, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_ENTER, KeyEvent.CHAR_UNDEFINED);
        menuSelectionManager.processKeyEvent(keyEvent);
    }
}
