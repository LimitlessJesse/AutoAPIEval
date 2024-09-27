import javax.swing.ComponentInputMap;
import javax.swing.KeyStroke;

public class ComponentInputMap_2 {
    public static void main(String[] args) {
        ComponentInputMap inputMap = new ComponentInputMap(null);
        KeyStroke keyStroke = KeyStroke.getKeyStroke("F1");
        
        inputMap.remove(keyStroke);
    }
}
