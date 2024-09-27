import java.awt.AWTKeyStroke;

public class AWTKeyStroke_5 {
    public static void main(String[] args) {
        AWTKeyStroke keyStroke = AWTKeyStroke.getAWTKeyStroke("ENTER");
        String keyString = keyStroke.toString();
        System.out.println(keyString);
    }
}
