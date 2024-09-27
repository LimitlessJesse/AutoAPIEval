import java.awt.AWTKeyStroke;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class AWTKeyStroke_2 {
    public static void main(String[] args) {
        AWTKeyStroke keyStroke = AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, InputEvent.SHIFT_DOWN_MASK);
        System.out.println(keyStroke);
    }
}
