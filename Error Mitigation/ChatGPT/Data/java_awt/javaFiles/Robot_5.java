import java.awt.Robot;
import java.awt.event.InputEvent;

public class Robot_5 {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
