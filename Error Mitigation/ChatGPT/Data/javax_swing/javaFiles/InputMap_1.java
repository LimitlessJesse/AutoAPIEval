import javax.swing.InputMap;
import javax.swing.KeyStroke;

public class InputMap_1 {
    public static void main(String[] args) {
        InputMap inputMap = new InputMap();
        KeyStroke keyStroke = KeyStroke.getKeyStroke("F1");
        Object actionMapKey = "help";
        
        inputMap.put(keyStroke, actionMapKey);
    }
}
