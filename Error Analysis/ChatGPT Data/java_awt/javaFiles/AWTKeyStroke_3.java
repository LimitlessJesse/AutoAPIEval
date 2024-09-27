import java.awt.AWTKeyStroke;

public class AWTKeyStroke_3 {
    public static void main(String[] args) {
        AWTKeyStroke keyStroke = AWTKeyStroke.getAWTKeyStroke('Z', AWTKeyStroke.CTRL_DOWN_MASK);
        int modifiers = keyStroke.getModifiers();
        System.out.println("Modifiers: " + modifiers);
    }
}
