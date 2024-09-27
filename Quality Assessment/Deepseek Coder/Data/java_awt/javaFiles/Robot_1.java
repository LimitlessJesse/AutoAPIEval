import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Robot_1 {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            Random random = new Random();

            // Press a random key
            int keycode = KeyEvent.VK_0 + random.nextInt(KeyEvent.VK_9 - KeyEvent.VK_0 + 1);
            robot.keyPress(keycode);

            // Release the key
            robot.keyRelease(keycode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
