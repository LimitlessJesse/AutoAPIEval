import javax.swing.UIManager;
import javax.swing.LookAndFeel;

public class LookAndFeel_4 {
    public static void main(String[] args) {
        LookAndFeel lookAndFeel = UIManager.getLookAndFeel();
        boolean isSupported = lookAndFeel.isSupportedLookAndFeel();
        System.out.println("Is supported look and feel: " + isSupported);
    }
}
