import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class Robot_2 {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ALT);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_ALT);
            robot.keyRelease(KeyEvent.VK_TAB);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
