import javax.swing.UIManager;
import javax.swing.LookAndFeel;

public class UIManager_4 {
    public static void main(String[] args) {
        LookAndFeel lookAndFeel = UIManager.getLookAndFeel();
        System.out.println("Current LookAndFeel: " + lookAndFeel.getName());
    }
}
