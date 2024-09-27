import javax.swing.InputMap;
import javax.swing.KeyStroke;

public class InputMap_3 {
    public static void main(String[] args) {
        InputMap inputMap = new InputMap();
        
        // Add KeyStroke and Object to InputMap
        KeyStroke keyStroke = KeyStroke.getKeyStroke("pressed A");
        Object value = "Action for key A";
        inputMap.put(keyStroke, value);
        
        // Get Object for a specific KeyStroke
        Object retrievedValue = inputMap.get(KeyStroke.getKeyStroke("pressed A"));
        System.out.println("Retrieved value: " + retrievedValue);
    }
}
