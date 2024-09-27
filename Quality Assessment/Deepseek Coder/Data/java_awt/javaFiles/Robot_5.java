import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.AWTException;

public class Robot_5 {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
