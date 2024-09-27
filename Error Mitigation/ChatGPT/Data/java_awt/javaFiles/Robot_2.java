import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Robot_2 {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_A); // Press the 'A' key
            robot.keyRelease(KeyEvent.VK_A); // Release the 'A' key
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
