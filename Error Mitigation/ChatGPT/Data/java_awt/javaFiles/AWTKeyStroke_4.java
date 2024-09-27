import java.awt.AWTKeyStroke;

public class AWTKeyStroke_4 {
    public static void main(String[] args) {
        AWTKeyStroke keyStroke = AWTKeyStroke.getAWTKeyStroke('A');
        int keyCode = keyStroke.getKeyCode();
        System.out.println("Key code: " + keyCode);
    }
}
