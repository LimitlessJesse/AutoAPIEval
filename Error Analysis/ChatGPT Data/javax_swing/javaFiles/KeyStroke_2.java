import javax.swing.KeyStroke;

public class KeyStroke_2 {
    public static void main(String[] args) {
        KeyStroke keyStroke = KeyStroke.getKeyStroke( KeyEvent.VK_A, InputEvent.CTRL_MASK);
        System.out.println("KeyStroke: " + keyStroke);
    }
}
