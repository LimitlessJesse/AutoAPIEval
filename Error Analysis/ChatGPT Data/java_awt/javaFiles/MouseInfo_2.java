import java.awt.MouseInfo;

public class MouseInfo_2 {
    public static void main(String[] args) {
        int numOfButtons = MouseInfo.getNumberOfButtons();
        System.out.println("Number of buttons: " + numOfButtons);
    }
}
