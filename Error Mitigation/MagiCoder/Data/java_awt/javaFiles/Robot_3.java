import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.MouseInfo;

public class Robot_3 {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            int button = MouseInfo.getNumberOfButtons() > 3? InputEvent.BUTTON1_DOWN_MASK : InputEvent.BUTTON1_MASK;
            robot.mousePress(button);
            robot.delay(1000);
            robot.mouseRelease(button);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
