import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class Robot_2 {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            robot.delay(5000); // Wait for 5 seconds
            robot.keyPress(KeyEvent.VK_A); // Press 'A' key
            robot.keyRelease(KeyEvent.VK_A); // Release 'A' key
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
