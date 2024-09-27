import javax.swing.UIManager;
import javax.swing.LookAndFeel;

public class UIManager_1 {
    public static void main(String[] args) {
        LookAndFeel currentLookAndFeel = UIManager.getLookAndFeel();
        System.out.println("Current Look and Feel: " + currentLookAndFeel);
    }
}
