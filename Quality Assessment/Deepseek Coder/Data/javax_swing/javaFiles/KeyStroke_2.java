import javax.swing.KeyStroke;
import java.awt.event.InputEvent;

public class KeyStroke_2 {
    public static void main(String[] args) {
        KeyStroke keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK);
        System.out.println(keyStroke);
    }
}
