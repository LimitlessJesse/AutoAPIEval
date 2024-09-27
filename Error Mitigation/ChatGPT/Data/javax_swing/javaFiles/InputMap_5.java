import javax.swing.InputMap;
import javax.swing.KeyStroke;

public class InputMap_5 {
    public static void main(String[] args) {
        InputMap inputMap = new InputMap();
        KeyStroke[] keyStrokes = inputMap.keys();
        for (KeyStroke keyStroke : keyStrokes) {
            System.out.println(keyStroke);
        }
    }
}
