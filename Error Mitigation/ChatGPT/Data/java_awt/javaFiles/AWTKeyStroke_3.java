import java.awt.AWTKeyStroke;

public class AWTKeyStroke_3 {
    public static void main(String[] args) {
        AWTKeyStroke keyStroke = AWTKeyStroke.getAWTKeyStroke('A');
        char keyChar = keyStroke.getKeyChar();
        System.out.println("Key Char: " + keyChar);
    }
}
