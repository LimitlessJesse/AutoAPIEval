import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Robot_1 {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_A); // Presses the 'A' key
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
