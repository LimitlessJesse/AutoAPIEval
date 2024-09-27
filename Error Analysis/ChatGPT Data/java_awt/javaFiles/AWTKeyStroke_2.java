import java.awt.AWTKeyStroke;
import java.awt.event.KeyEvent;
import java.util.Set;

public class AWTKeyStroke_2 {
    public static void main(String[] args) {
        AWTKeyStroke keyStroke = AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK);
        Set<AWTKeyStroke> keyCharSet = keyStroke.parseKeyStroke("typed a");
        for (AWTKeyStroke keyChar : keyCharSet) {
            System.out.println(keyChar.getKeyChar());
        }
    }
}
