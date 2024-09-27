import java.awt.Robot;
import java.awt.event.InputEvent;

public class Robot_4 {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            // Presses the left mouse button
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
