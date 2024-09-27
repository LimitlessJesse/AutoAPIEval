import javax.swing.InputMap;
import javax.swing.KeyStroke;

public class InputMap_2 {
    public static void main(String[] args) {
        InputMap inputMap = new InputMap();
        KeyStroke key = KeyStroke.getKeyStroke("F1");
        
        // Removing key from InputMap
        inputMap.remove(key);
    }
}
