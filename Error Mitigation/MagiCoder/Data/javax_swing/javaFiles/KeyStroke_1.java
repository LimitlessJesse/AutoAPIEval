import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;

public class KeyStroke_1 {
    public static void main(String[] args) {
        KeyEvent e = new KeyEvent(null, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_A, 'A');
        KeyStroke keyStroke = KeyStroke.getKeyStrokeForEvent(e);
        System.out.println(keyStroke);
    }
}
