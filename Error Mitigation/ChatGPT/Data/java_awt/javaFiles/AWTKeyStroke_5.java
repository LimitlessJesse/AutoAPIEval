import java.awt.AWTKeyStroke;

public class AWTKeyStroke_5 {
    public static void main(String[] args) {
        AWTKeyStroke keyStroke = AWTKeyStroke.getAWTKeyStroke('A', java.awt.event.InputEvent.CTRL_DOWN_MASK);
        int modifiers = keyStroke.getModifiers();
        System.out.println("Modifiers: " + modifiers);
    }
}
