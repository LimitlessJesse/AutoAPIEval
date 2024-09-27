import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;

public class KeyStroke_5 {
    public static void main(String[] args) {
        KeyStroke keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0);
        System.out.println(keyStroke);
    }
}
