import javax.swing.ComponentInputMap;
import javax.swing.KeyStroke;

public class ComponentInputMap_1 {
    public static void main(String[] args) {
        ComponentInputMap inputMap = new ComponentInputMap(null);
        KeyStroke keyStroke = KeyStroke.getKeyStroke("F1");
        Object actionMapKey = "help";
        
        inputMap.put(keyStroke, actionMapKey);
    }
}
