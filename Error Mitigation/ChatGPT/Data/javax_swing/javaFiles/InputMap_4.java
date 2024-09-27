import javax.swing.InputMap;
import javax.swing.KeyStroke;

public class InputMap_4 {
    public static void main(String[] args) {
        InputMap inputMap = new InputMap();
        KeyStroke keyStroke = KeyStroke.getKeyStroke("pressed A");
        Object binding = inputMap.get(keyStroke);
        System.out.println("Binding for keyStroke: " + binding);
    }
}
