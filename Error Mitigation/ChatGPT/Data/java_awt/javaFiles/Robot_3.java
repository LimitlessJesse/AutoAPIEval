import java.awt.Robot;
import java.awt.AWTException;

public class Robot_3 {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            robot.mouseMove(100, 100); // Moves mouse pointer to coordinates (100, 100)
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
