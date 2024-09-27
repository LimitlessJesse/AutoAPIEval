import java.awt.Robot;
import java.awt.event.InputEvent;

public class Robot_3 {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            robot.mouseMove(100, 200); // Moves the mouse to the coordinates (100, 200)
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
