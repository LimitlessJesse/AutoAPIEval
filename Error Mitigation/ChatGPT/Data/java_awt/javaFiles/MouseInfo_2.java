import java.awt.MouseInfo;
import java.awt.HeadlessException;

public class MouseInfo_2 {
    public static void main(String[] args) {
        try {
            int numberOfButtons = MouseInfo.getNumberOfButtons();
            System.out.println("Number of buttons on the mouse: " + numberOfButtons);
        } catch (HeadlessException e) {
            System.out.println("HeadlessException: " + e.getMessage());
        }
    }
}
