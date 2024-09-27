import java.awt.AWTException;
import java.awt.Robot;

public class Robot_4 {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            robot.mouseRelease(java.awt.event.InputEvent.BUTTON1_DOWN_MASK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
