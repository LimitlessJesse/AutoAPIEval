import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class Robot_7 {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            robot.mouseWheel(10); // scrolls down 10 notches
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
