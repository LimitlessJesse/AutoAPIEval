import javax.swing.InputMap;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;

public class InputMap_1 {
    public static void main(String[] args) {
        InputMap inputMap = new InputMap();
        KeyStroke keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0);
        Object actionMapKey = "actionKey";
        inputMap.put(keyStroke, actionMapKey);
    }
}
