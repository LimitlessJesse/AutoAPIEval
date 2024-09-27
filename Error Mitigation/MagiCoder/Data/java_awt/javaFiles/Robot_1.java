import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class Robot_1 {
    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();

        // Press the 'A' key
        robot.keyPress(KeyEvent.VK_A);

        // Release the 'A' key
        robot.keyRelease(KeyEvent.VK_A);
    }
}
