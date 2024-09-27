import javax.swing.KeyStroke;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class KeyStroke_3 {
    public static void main(String[] args) {
        KeyStroke keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK);
        System.out.println(keyStroke);
    }
}
