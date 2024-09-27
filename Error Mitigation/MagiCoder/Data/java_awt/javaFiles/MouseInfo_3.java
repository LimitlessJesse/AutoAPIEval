import java.awt.MouseInfo;
import java.awt.HeadlessException;

public class MouseInfo_3 {
    public static void main(String[] args) {
        try {
            int numberOfButtons = MouseInfo.getNumberOfButtons();
            System.out.println("Number of buttons: " + numberOfButtons);
        } catch (HeadlessException e) {
            e.printStackTrace();
        }
    }
}
