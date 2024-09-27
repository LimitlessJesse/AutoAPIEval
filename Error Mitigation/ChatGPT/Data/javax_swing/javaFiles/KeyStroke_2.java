import javax.swing.KeyStroke;

public class KeyStroke_2 {
    public static void main(String[] args) {
        KeyStroke keyStroke = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.SHIFT_DOWN_MASK);
        System.out.println(keyStroke);
    }
}
